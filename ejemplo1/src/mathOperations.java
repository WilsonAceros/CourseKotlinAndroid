public class mathOperations {
    public static void main(String[] args) {
        var x=2.1;
        var y=3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un nÃºmero elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        //4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
