class exercise_9 {
    public static void main(String[] args) {

        /**
         * Crea una clase Persona con las siguientes variables: La edad, El nombre, El teléfono
         *  -Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
         *  -Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
         *  -Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
         */

        System.out.println("\n# Ejercicio N°1");
        Cliente cliente = new Cliente();
        cliente.setEdad(40);
        cliente.setNombre("PEDRO CASTILLO");
        cliente.setTelefono("(+51) 930 000 000");
        cliente.setCredito(10000);
        System.out.println("Cliente -> " + cliente);

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(60);
        trabajador.setNombre("FUJIMORI");
        trabajador.setTelefono("(+51) 930 111 111");
        trabajador.setSalario(1900);
        System.out.println("Trabajador -> " + trabajador);
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

    public static class Cliente extends Persona{
        private int credito = 0;

        public int getCredito() { return credito; }
        public void setCredito(int credito) { this.credito = credito; }

        @Override
        public String toString() {
            return super.toString() + " credito: " + credito;
        }
    }
    public static class Trabajador extends Persona{
        private int salario = 0;

        public int getSalario() { return salario; }
        public void setSalario(int salario) { this.salario = salario; }

        @Override
        public String toString() {
            return super.toString() + " salario: " + salario;
        }
    }
}