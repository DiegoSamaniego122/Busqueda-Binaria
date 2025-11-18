public class BusquedaBinaria {

    public static Persona busquedaBinaria(Persona[] arr, int valorBuscado) {

        // Mostrar arreglo inicial
        for (Persona p : arr) {
            System.out.print(p.getEdad() + " | ");
        }
        System.out.println();

        int bajo = 0;
        int alto = arr.length - 1;

        while (bajo <= alto) {

            int centro = (bajo + alto) / 2;
            int valorCentro = arr[centro].getEdad();

            // Mostrar subarreglo actual
            for (int i = bajo; i <= alto; i++) {
                System.out.print(arr[i].getEdad() + (i < alto ? " | " : ""));
            }
            System.out.println();

            System.out.println("bajo=" + bajo +
                               " alto=" + alto +
                               " centro=" + centro +
                               " valorCentro=" + valorCentro +
                               (valorCentro == valorBuscado ? " --> ENCONTRADO"
                               : (valorCentro < valorBuscado ? " --> DERECHA" : " --> IZQUIERDA")));

            if (valorCentro == valorBuscado) {
                return arr[centro];
            } else if (valorCentro < valorBuscado) {
                bajo = centro + 1;
            } else {
                alto = centro - 1;
            }
        }

        return null;
    }
}