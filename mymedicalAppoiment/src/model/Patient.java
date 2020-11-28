package model;

public class Patient extends User{
    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde naciemiento");
    }

    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name,email);
    }

    // 54.5
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 54.5 Kg. String
    public String getWeight(){
        return this.weight + " Kg.";
    }



    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String getBirthday() {

        return birthday;
    }

    public void setBirthday(String birthday) {

        this.birthday = birthday;
    }



    public String getBlood() {

        return blood;
    }

    public void setBlood(String blood) {

        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }
}
