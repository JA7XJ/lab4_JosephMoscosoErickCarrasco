/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josephmoscosoerickcarrasco;

/**
 *
 * @author erick
 */
public class Piloto {

    private String nombre;
    private int edad;
    private String familiar;
    private String EncargadoNerv;
    private String Escuela;
    private double sincronizacion;
    EVA asignado;

    public Piloto() {
    }

    public Piloto(String nombre, int edad, String familiar, String EncargadoNerv, String Escuela, double sincronizacion, EVA asignado) {
        this.nombre = nombre;
        this.edad = edad;
        this.familiar = familiar;
        this.EncargadoNerv = EncargadoNerv;
        this.Escuela = Escuela;
        this.sincronizacion = sincronizacion;
        this.asignado = asignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFamiliar() {
        return familiar;
    }

    public void setFamiliar(String familiar) {
        this.familiar = familiar;
    }

    public String getEncargadoNerv() {
        return EncargadoNerv;
    }

    public void setEncargadoNerv(String EncargadoNerv) {
        this.EncargadoNerv = EncargadoNerv;
    }

    public String getEscuela() {
        return Escuela;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }

    public double getSincronizacion() {
        return sincronizacion;
    }

    public void setSincronizacion(double sincronizacion) {
        this.sincronizacion = sincronizacion;
    }

    public EVA getAsignado() {
        return asignado;
    }

    public void setAsignado(EVA asignado) {
        this.asignado = asignado;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nombre=" + nombre + ", edad=" + edad + ", familiar=" + familiar + ", EncargadoNerv=" + EncargadoNerv + ", Escuela=" + Escuela + ", sincronizacion=" + sincronizacion + ", asignado=" + asignado + '}';
    }

}
