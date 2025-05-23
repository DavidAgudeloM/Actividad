import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //En esta línea creamos el lector de datos de entrada por consola
        ArrayList<Usuario> usuario = new ArrayList<>();  // Creación de la lista usuario para almacenar los datos ingresados en la consola

        System.out.println("Registro de 5 personas:");
        //Ciclo para leer los datos ingresados e imprimir
        for (int i = 0; i < 5; i++) {
            System.out.println("Persona " + (i + 1)); //Muestra el ingreso controlado del número de datos por el usuario 1,2,3,4,5
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine(); //Leer línea ingresada por el usuario

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();  //Leer línea ingresada por el usuario

            System.out.print("Género en ¡Sólo una letra! (Masculino (M)/Femenino (F)): ");
            String genero = scanner.nextLine();  //Leer línea ingresada por el usuario

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());  //Leer línea ingresada por el usuario

            usuario.add(new Usuario(nombre, apellido, genero, edad));  //Línea que agrega la información dada en cada atributo de la clase Usuario
        }

        mostrarDatos(usuario);
        System.out.println("Promedio de edades: " + PromedioEdades(usuario));  //Línea para imprimir el valor del promedio de las edades agregadas
        System.out.println("Cantidad de personas con género Masculino: " + contarGenero(usuario, "M"));  //Línea para imprimir el número de géneros Masculinos
        System.out.println("Cantidad de personas con género Femenino: " + contarGenero(usuario, "F")); //Línea para imprimir el número de géneros Femenino
    }
    //Método para mostrar nombre y géneros de los usuarios
    public static void mostrarDatos(ArrayList<Usuario> usuario) {
        System.out.println("\nNombre y Género de las personas:");
        //Ciclo for - Para imprimir los nombres y el género de todos los Usuarios
        for (Usuario p : usuario) {
            System.out.println("Nombre: " + p.getNombre() + " - Género: " + p.getGenero());
        }
    }
    //Método para calcular el promedio de todas las edades
    public static double PromedioEdades(ArrayList<Usuario> usuario) {
        int suma = 0;  //Declaración e inicialización de atributo
        for (Usuario p : usuario) {
            suma += p.getEdad();  //Línea para sumar cada una de las edades agregadas en consola
        }
        return (double) suma / usuario.size();  // Se retorna el valor de la suma de las edades divido con la cantidad de usuarios
    }
    //Método para contar el género de las personas agregadas
    public static int contarGenero(ArrayList<Usuario> usuario, String genero) {
        int contador = 0;
        for (Usuario p : usuario) {
            if (p.getGenero().equalsIgnoreCase(genero)) {  // Condicional para Comparar el genero con el agregado con el usuario
                contador++;  //Línea para aumentar el contador cada que valide M y F según el género
            }
        }
        return contador;  //Retornamos ese valor agregado
    }
}