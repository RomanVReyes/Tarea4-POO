public class Persona {
    // Atributos demográficos
    protected String nombre;
    private int edad;
    private String genero;
    protected String direccion;
    protected String telefono;

    // Constructor
    public Persona(String nombre, int edad, String genero, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Métodos
    protected void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    private void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public void tomarShower() {
        System.out.println(nombre + " está tomando una ducha.");
    }

    // Método para mostrar los valores de los atributos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona = new Persona("Juan", 30, "Masculino", "Calle Principal 123", "123456789");

        // Mostrar información de la persona
        System.out.println("Información de la persona:");
        persona.mostrarInformacion();

        // Invocar métodos
        persona.comer();
        persona.dormir(); // Este método es privado y no se puede invocar directamente fuera de la clase Persona
        persona.tomarShower();
    }
}
