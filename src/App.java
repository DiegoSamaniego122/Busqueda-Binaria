import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de Personas del listado: ");
        int n = sc.nextInt();
        sc.nextLine();

        Persona[] personas = new Persona[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese Persona:");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            personas[i] = new Persona(nombre, edad);
        }

        // Ordenar
        Ordenamiento.bubbleSort(personas);

        System.out.print("Valor la persona de la edad: ");
        int edadBuscar = sc.nextInt();

        // Búsqueda
        Persona encontrada = BusquedaBinaria.busquedaBinaria(personas, edadBuscar);

        if (encontrada != null) {
            System.out.println("La persona con la edad " + edadBuscar +
                               " es " + encontrada.getNombre());
        } else {
            System.out.println("No existe una persona con esa edad.");
        }

        sc.close();
    }
}