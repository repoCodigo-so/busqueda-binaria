/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedabinaria;

/**
 *
 * @author connec
 */
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingrese los elementos del arreglo (ordenados de forma ascendente):");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número a buscar en el arreglo: ");
        int elementoBuscado = scanner.nextInt();

        int indiceElemento = busquedaBinaria(arreglo, elementoBuscado);

        if (indiceElemento == -1) {
            System.out.println("El elemento no se encuentra en el arreglo.");
        } else {
            System.out.println("El elemento se encuentra en el índice " + indiceElemento + " del arreglo.");
        }
    }

    public static int busquedaBinaria(int[] arreglo, int elementoBuscado) {
        int inicio = 0; // índice del primer elemento del arreglo
        int fin = arreglo.length - 1; // índice del último elemento del arreglo

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2; // índice del elemento medio del arreglo

            if (arreglo[medio] == elementoBuscado) { // el elemento se encuentra en el medio del arreglo
                return medio;
            } else if (arreglo[medio] < elementoBuscado) { // el elemento buscado está en la mitad derecha del arreglo
                inicio = medio + 1;
            } else { // el elemento buscado está en la mitad izquierda del arreglo
                fin = medio - 1;
            }
        }

        return -1; // el elemento buscado no se encuentra en el arreglo
    }
}