public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(30);
        persona.setNombre("Diony");
        persona.setTelefono("+18492058331");

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        String telefono = persona.getTelefono();

        System.out.printf("Mi nombre es %s, mi edad es %d, me pueden contactar al siguiente numero: %s", nombre, edad, telefono);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
 }