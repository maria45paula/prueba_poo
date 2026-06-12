package org.example;

public class Busqueda {
    public int buscar(int[] lista, int valor) {
        int bajo = 0;
        int alto = lista.length - 1;
        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;
            if (lista[medio] == valor) return medio;
            if (lista[medio] < valor) bajo = medio + 1;
            else alto = medio - 1;

        }
        return -1;
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }

        int n = arr.length;
        boolean swapped;

        // Recorremos el arreglo varias veces
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Últimos i elementos ya están en su lugar
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped) break;
        }
    }

}
