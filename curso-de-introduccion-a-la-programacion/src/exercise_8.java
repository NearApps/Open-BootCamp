class exercise_8 {
    public static void main(String[] args) {
        /**
         * Para practicar la encapsulación:
         *  -Crear clase Persona.
         *  -Crear variables las privadas edad, nombre y telefono de la clase Persona.
         *  -Crear gets y sets de cada propiedad.
         *  -Crear un objeto persona en el main.
         *  -Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
         */

        System.out.println("\n# Ejercicio N°1");
        Persona persona = new Persona();
        persona.setEdad(40);
        persona.setNombre("PEDRO CASTILLO");
        persona.setTelefono("(+51) 930 000 000");

        System.out.println("Persona -> " + persona);
    }

    public static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() { return edad; }
        public void setEdad(int edad) { this.edad = edad; }
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public String getTelefono() { return telefono; }
        public void setTelefono(String telefono) { this.telefono = telefono; }

        @Override
        public String toString(){
            return "nombre: " + getNombre() + " edad:" + getEdad() + " telefono:" + getTelefono();
        }

    }
}