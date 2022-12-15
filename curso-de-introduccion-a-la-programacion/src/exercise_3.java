

class exercise_3 {
    public static void main(String[] args) {

        /**
         * -Crear una función con tres parámetros que sean números que se suman entre sí.
         * -Llamar a la función en el main y darle valores.
         */
        System.out.println("\n# Ejercicio N°1");
        int suma = suma(10, 20, 30);
        System.out.println("Suma: " + suma);

        /**
         * -Crear una clase coche.
         * -Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
         * -Una función que incremente el número de puertas que tiene el coche.
         * -Crear un objeto miCoche en el main y añadirle una puerta.
         * -Mostrar el número de puertas que tiene el objeto.
         */
        System.out.println("\n# Ejercicio N°2");
        Coche miCoche = new Coche();
        miCoche.imcrementarPuertas();
        System.out.println("numero de puertas: " + miCoche.puertas);
    }

    public static int suma( int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static class Coche{
        public int puertas = 0;

        public void imcrementarPuertas() {
            puertas++;
        }
    }
}