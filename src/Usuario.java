public class Usuario {
    //Atributos de ingreso privado
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;


    // Constructor
    public Usuario(String nombre, String apellido, String genero, int edad) {

        //Asignación de valores agregados a cada atributo creado
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
}


