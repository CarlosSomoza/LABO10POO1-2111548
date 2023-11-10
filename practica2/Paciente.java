/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author carlo
 */
public class Paciente {
    int DNI;
    String nombre;
    String direccion;
    double peso;
    double temperatura;
    Medico medico;

    public Paciente(int DNI, String nombre, String direccion, double peso, double temperatura, Medico medico) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.peso = peso;
        this.temperatura = temperatura;
        this.medico = medico;
    }
    
        // Getter para DNI
    public int getDNI() {
        return DNI;
    }

    // Setter para DNI
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para direccion
    public String getDireccion() {
        return direccion;
    }

    // Setter para direccion
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter para peso
    public double getPeso() {
        return peso;
    }

    // Setter para peso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Getter para temperatura
    public double getTemperatura() {
        return temperatura;
    }

    // Setter para temperatura
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    // Getter para medico
    public Medico getMedico() {
        return medico;
    }

    // Setter para medico
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
