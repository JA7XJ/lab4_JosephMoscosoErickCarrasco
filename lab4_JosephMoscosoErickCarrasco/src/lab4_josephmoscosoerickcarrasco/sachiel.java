/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josephmoscosoerickcarrasco;

import java.awt.Color;

/**
 *
 * @author Joseph
 */
public class sachiel extends Angeles{

    public sachiel() {
    }

    public sachiel(Color color, String descripcione, String colorsangre, String fecha, String nombre, String volar, int potencia) {
        super(color, descripcione, colorsangre, fecha, nombre, volar, potencia);
    }

    @Override
    public String[][] movimiento(String[][] z, int x, int y, int ox, int oy) {
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[0].length; j++) {
                if (Math.abs(oy-oy+1)==Math.abs(ox-ox+1)) {
                    z[i][j]="S";
                }else{
                    System.out.println("Error, no se puede mover");
                }
            }
        }
        return z;
    }

    @Override
    public String[][] atacar(String[][] z, int x, int y, int ox, int oy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
