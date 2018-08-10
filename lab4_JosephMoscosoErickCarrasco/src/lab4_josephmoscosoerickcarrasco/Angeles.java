/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josephmoscosoerickcarrasco;

import java.awt.Color;

/**
 *
 * @author erick
 */
public class Angeles {
    private Color color;
    private String descripcione;
    private String colorsangre;
    private String fecha;
    private String nombre;
    private String volar;
    private int potencia;

    public Angeles() {
    }

    public Angeles(Color color, String descripcione, String colorsangre, String fecha, String nombre, String volar, int potencia) {
        this.color = color;
        this.descripcione = descripcione;
        this.colorsangre = colorsangre;
        this.fecha = fecha;
        this.nombre = nombre;
        this.volar = volar;
        this.potencia = potencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcione() {
        return descripcione;
    }

    public void setDescripcione(String descripcione) {
        this.descripcione = descripcione;
    }

    public String getColorsangre() {
        return colorsangre;
    }

    public void setColorsangre(String colorsangre) {
        this.colorsangre = colorsangre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Angeles{" + "color=" + color + ", descripcione=" + descripcione + ", colorsangre=" + colorsangre + ", fecha=" + fecha + ", nombre=" + nombre + ", volar=" + volar + ", potencia=" + potencia + '}';
    }
    
}
