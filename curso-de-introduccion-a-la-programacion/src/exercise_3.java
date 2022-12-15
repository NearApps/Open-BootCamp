

class exercise_3 {
    public static void main(String[] args) {

        int suma = suma(10, 20, 30);
        System.out.println("Suma: " + suma);

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