/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseprincipa;
import java.util.Scanner;
/**
 *
 * @author Personal
 */


    /**
     * @param args the command line arguments
     */
   
        
public class Claseprincipal {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("** EduPilo S.A.********");
            System.out.println("*** MENÚ GESTIÓN ESTUDIANTES ****");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar Estudiante por Nombre");
            System.out.println("4. Calcular el promedio general");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestion.agregarEstudiante();
                    break;
                case 2:
                    gestion.mostrarEstudiantes();
                    break;
               
               case 3:
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    gestion.buscarPorNombre(nombre);
                    break;
                case 4:
                    gestion.calcularPromedioGeneral();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);
    }
                
}

