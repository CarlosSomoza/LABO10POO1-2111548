package practica2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Constuctoes {
    public List<Paciente> listaPacientes = new ArrayList<>();

    public void registrarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void eliminarPaciente(int posicion) {
        if (posicion >= 0 && posicion < listaPacientes.size()) {
            listaPacientes.remove(posicion);
            System.out.println("Paciente eliminado exitosamente.");
        } else {
            System.out.println("Posición inválida. No se pudo eliminar el paciente.");
        }
    }

    public void modificarDatosPaciente(int posicion, Paciente nuevoPaciente) {
        if (posicion >= 0 && posicion < listaPacientes.size()) {
            listaPacientes.set(posicion, nuevoPaciente);
            System.out.println("Datos del paciente modificados exitosamente.");
        } else {
            System.out.println("Posición inválida. No se pudo modificar los datos del paciente.");
        }
    }
    
    public void mostrarPesoMayorYMenor() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return;
        }

        double pesoMayor = listaPacientes.get(0).getPeso();
        double pesoMenor = listaPacientes.get(0).getPeso();

        for (Paciente paciente : listaPacientes) {
            double pesoActual = paciente.getPeso();

            if (pesoActual > pesoMayor) {
                pesoMayor = pesoActual;
            }

            if (pesoActual < pesoMenor) {
                pesoMenor = pesoActual;
            }
        }

        System.out.println("El peso mayor es: " + pesoMayor);
        System.out.println("El peso menor es: " + pesoMenor);
    }

        public void mostrarPesoQueMasSeRepite() {
        Map<Double, Integer> frecuenciaPesos = new HashMap<>();

        for (Paciente paciente : listaPacientes) {
            double peso = paciente.getPeso();
            frecuenciaPesos.put(peso, frecuenciaPesos.getOrDefault(peso, 0) + 1);
        }

        double pesoMasRepetido = 0;
        int maxFrecuencia = 0;

        for (Map.Entry<Double, Integer> entry : frecuenciaPesos.entrySet()) {
            double peso = entry.getKey();
            int frecuencia = entry.getValue();

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                pesoMasRepetido = peso;
            }
        }
        System.out.println("El peso que más se repite es: " + pesoMasRepetido);
    }

    public void mostrarCantidadPorPeso(double pesoBuscar) {
        int cantidadPacientesConPeso = 0;

        for (Paciente paciente : listaPacientes) {
            if (paciente.getPeso() == pesoBuscar) {
                cantidadPacientesConPeso++;
            }
        }
        System.out.println("La cantidad de pacientes con peso " + pesoBuscar + " es: " + cantidadPacientesConPeso);
    }
    
    public void indicarDoctorDePaciente(int posicion) {
        if (posicion >= 0 && posicion < listaPacientes.size()) {
            Paciente paciente = listaPacientes.get(posicion);
            Medico medico = paciente.getMedico();
            System.out.println("El paciente fue atendido por el doctor: " + medico.getNombre());
        } else {
            System.out.println("Posición inválida.");
        }
    }
    
    public void mostrarListaOrdenadaPorApellidos() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return;
        }

        listaPacientes.sort(Comparator.comparing(Paciente::getApellido));

        System.out.println("----- Lista de Pacientes Ordenados por Apellidos -----");
        for (Paciente paciente : listaPacientes) {
            System.out.println("DNI: " + paciente.getDNI());
            System.out.println("Nombre: " + paciente.getNombre());
            System.out.println("Apellido: " + paciente.getApellido());
            System.out.println("Dirección: " + paciente.getDireccion());
            System.out.println("Peso: " + paciente.getPeso());
            System.out.println("Temperatura: " + paciente.getTemperatura());
            System.out.println("------------------------");
        }
    }

    public void buscarDoctoresPorEspecialidad(String especialidad) {
        System.out.println("Doctores con especialidad '" + especialidad + "':");
        for (Paciente paciente : listaPacientes) {
            Medico medico = paciente.getMedico();
            if (medico.getEspecialidad().equalsIgnoreCase(especialidad)) {
                System.out.println("- " + medico.getNombre());
            }
        }
    }
    
    //Easter egg
    public void mostrarListaPacientes() {
    System.out.println("----- Lista de Pacientes -----");
    for (int i = 0; i < listaPacientes.size(); i++) {
        Paciente paciente = listaPacientes.get(i);
        Medico medico = paciente.getMedico();
        System.out.println("Posición " + i + ":");
        System.out.println("DNI: " + paciente.getDNI());
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Dirección: " + paciente.getDireccion());
        System.out.println("Peso: " + paciente.getPeso());
        System.out.println("Temperatura: " + paciente.getTemperatura());
        System.out.println("Médico: " + medico.getNombre() + ", Especialidad: " + medico.getEspecialidad());
        System.out.println("------------------------");
    }
    }
}


