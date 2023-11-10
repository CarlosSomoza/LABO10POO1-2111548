/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Constuctoes sistema = new Constuctoes();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("----- Menu de Operaciones -----");
            System.out.println("1. Registrar datos paciente");
            System.out.println("2. Eliminar paciente");
            System.out.println("3. Modificar datos de paciente");
            System.out.println("4. Mostrar peso que mas se repite");
            System.out.println("5. Mostrar cantidad de pacientes por peso");
            System.out.println("6. Mostrar peso mayor y menor");
            System.out.println("7. Dividir rango de pesos y mostrar cantidad por rango");
            System.out.println("8. Mostrar lista de pacientes ordenados por apellidos");
            System.out.println("9. Indicar que doctor atendio a un paciente");
            System.out.println("10. Buscar doctores por especialidad");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del paciente:");
                    System.out.print("DNI: ");
                    int dni = scanner.nextInt();
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Dirección: ");
                    String direccion = scanner.next();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Temperatura: ");
                    double temperatura = scanner.nextDouble();
                   
                    System.out.println("Ingrese los datos del médico:");
                    System.out.print("Número de colegiatura: ");
                    int numeroColegiatura = scanner.nextInt();
                    System.out.print("Nombre del médico: ");
                    String nombreMedico = scanner.next();
                    System.out.print("Especialidad: ");
                    String especialidadMedico = scanner.next();
                    Medico medico = new Medico(numeroColegiatura, nombreMedico, especialidadMedico);

                    Paciente nuevoPaciente = new Paciente(dni, nombre, direccion, peso, temperatura, medico);
                    sistema.registrarPaciente(nuevoPaciente);

                    System.out.println("Paciente registrado exitosamente.");
                    break;
                    
                case 2:
                    System.out.print("Ingrese la posición del paciente a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    sistema.eliminarPaciente(posicionEliminar);
                    break;
                    
                case 3:
                    System.out.print("Ingrese la posición del paciente a modificar: ");
                    int posicionModificar = scanner.nextInt();

                    // Obtener el paciente actual
                    Paciente pacienteActual = sistema.listaPacientes.get(posicionModificar);

                    // Solicitar nuevos datos del paciente
                    System.out.println("Ingrese los nuevos datos del paciente:");
                    System.out.print("DNI: ");
                    dni = scanner.nextInt();
                    System.out.print("Nombre: ");
                    nombre = scanner.next();
                    System.out.print("Dirección: ");
                    direccion = scanner.next();
                    System.out.print("Peso: ");
                    peso = scanner.nextDouble();
                    System.out.print("Temperatura: ");
                    temperatura = scanner.nextDouble();

                    // Modificar el paciente con los nuevos datos
                    Medico medicoActual = pacienteActual.getMedico();
                    Paciente pacienteModificado = new Paciente(dni, nombre, direccion, peso, temperatura, medicoActual);
                    sistema.modificarDatosPaciente(posicionModificar, pacienteModificado);

                    System.out.println("Datos del paciente modificados exitosamente.");
                    break;
                    
                case 4:
                    sistema.mostrarPesoQueMasSeRepite();
                    break;
                    
                case 9:
                    System.out.print("Ingrese la posición del paciente para indicar qué doctor lo atendió: ");
                    int posicionIndicarDoctor = scanner.nextInt();
                    sistema.indicarDoctorDePaciente(posicionIndicarDoctor);
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                    
                case 11:
                    sistema.mostrarListaPacientes();
                    break;

                default:
                    System.out.println("Opción no valida. Por favor, ingrese una opción valida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
