public class Main {
    public static void main(String[] args) {
            Cliente cliente = new Cliente();

            cliente.setEdad(18);
            cliente.setNombre("Juan Perez");
            cliente.setTelefono(999999999);
            cliente.setCredito(10000000);

            System.out.println("Edad cliente: " + cliente.getEdad());
            System.out.println("Nombre cliente: " + cliente.getNombre());
            System.out.println("Telefono cliente: " + cliente.getTelefono());
            System.out.println("Credito cliente: " + cliente.getCredito());

            Trabajador trabajador = new Trabajador();

            trabajador.setSalario(2500000);

            System.out.println();
            System.out.println("Salario trabajador: " + trabajador.getSalario());
        }
    }

    class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getTelefono() {
            return this.telefono;
        }
    }

    class Cliente extends Persona {
        private int credito;
        public void setCredito(int credito) {
            this.credito = credito;
        }

        public int getCredito() {
            return this.credito;
        }
    }

    class Trabajador extends Persona {
        private int salario;
        public void setSalario(int salario) {
            this.salario = salario;
        }

        public int getSalario() {
            return this.salario;
        }
    }