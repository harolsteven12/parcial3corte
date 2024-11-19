/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseprincipa;
import java.util.Scanner;
/**
 *
 * @author Personal
 */


public class GestionEstudiantes {
    private Estudiante[] estudiantes;
    private int cantidadActual;
    private final int capacidadMax = 100;

    public GestionEstudiantes() {
        estudiantes = new Estudiante[capacidadMax];
        cantidadActual = 0;
    }

    public void agregarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese promedio: ");
        double promedio = scanner.nextDouble();
        scanner.nextLine();

        if (cantidadActual < capacidadMax) {
            estudiantes[cantidadActual] = new Estudiante(nombre, edad, promedio);
            cantidadActual++;
            System.out.println("Estudiante agregado con éxito.");
        } else {
            System.out.println("No hay espacio disponible.");
        }
    }

    public void mostrarEstudiantes() {
        for (int i = 0; i < cantidadActual; i++) {
            System.out.println("Nombre: " + estudiantes[i].getNombre() +
                    ", Edad: " + estudiantes[i].getEdad() +
                    ", Promedio: " + estudiantes[i].getPromedio());
        }
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadActual; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].getNombre() +
                        ", Edad: " + estudiantes[i].getEdad() +
                        ", Promedio: " + estudiantes[i].getPromedio());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void calcularPromedioGeneral() {
        double sumPromedio = 0;
        for (int i = 0; i < cantidadActual; i++) {
            sumPromedio += estudiantes[i].getPromedio();
        }
        double promedioGeneral = sumPromedio / cantidadActual;
        System.out.println("Promedio general: " + promedioGeneral);
    }
}



