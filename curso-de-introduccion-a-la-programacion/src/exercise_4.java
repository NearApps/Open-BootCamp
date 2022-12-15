class exercise_4 {
    public static void main(String[] args) {
        /**
         * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
         * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
         */

        int numeroIf = -2;

        System.out.println("\n# Problema N°1");
        if ( numeroIf > 0){ System.out.println("El numero " + numeroIf + " es positivo"); }
        else if ( numeroIf == 0){ System.out.println("El numero " + numeroIf + " es 0"); }
        else { System.out.println("El numero " + numeroIf + " es negativo"); }

        /**
         * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
         *  -Incrementar el valor de la variable en uno cada vez que se ejecute.
         *  -Mostrarlo por pantalla cada vez que se ejecute.
         */

        System.out.println("\n# Problema N°2");
        int numeroWhile = -1;
        while ( numeroWhile < 3 ){
            numeroWhile++;
            System.out.println("-Numero: " + numeroWhile);
        }

        /**
         * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
         */

        System.out.println("\n# Problema N°3");
        int numeroDoWhile = 10;
        do{
            numeroDoWhile++;
            System.out.println("-Numero: " + numeroDoWhile);
        }while ( numeroDoWhile < 3 );

        /**
         * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
         */

        System.out.println("\n# Problema N°4");
        for ( int numeroFor=0; numeroFor<=3; numeroFor++ ){
            System.out.println("-Numero: " + numeroFor);
        }

        /**
         * Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá
         */

        System.out.println("\n# Problema N°5");
        String estacion = "OTOÑO";
        switch (estacion){
            case "PRIMAVERA":   System.out.println("la estacion es PRIMAVERA");     break;
            case "VERANO":      System.out.println("la estacion es VERANO");        break;
            case "OTOÑO":       System.out.println("la estacion es OTOÑO");         break;
            case "INVIERNO":    System.out.println("la estacion es INVIERNO");      break;
            default:            System.out.println("No es una estacion válida");    break;
        }
    }
}