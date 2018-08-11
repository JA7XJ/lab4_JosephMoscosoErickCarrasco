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
public class ramiel extends Angeles {

    public ramiel() {
    }

    public ramiel(Color color, String descripcione, String colorsangre, String fecha, String nombre, String volar, int potencia) {
        super(color, descripcione, colorsangre, fecha, nombre, volar, potencia);
    }

    @Override
    public String[][] movimiento(String[][] z, int x, int y, int ox, int oy) {
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[0].length; j++) {
                if (y == i && x == j) {
                    if (y == i + 1 && x == j + 1 && z[i][j].equals("R") || z[i][j].equals("R") || z[i][j].equals("Z") || z[i][j].equals("Z")
                            || z[i][j].equals("S") || z[i][j].equals("S") || z[i][j].equals("Z") || z[i][j].equals("Z")
                            || z[i][j].equals("PM") || z[i][j].equals("PM") || z[i][j].equals("EV0") || z[i][j].equals("EV1") || z[i][j].equals("EV2")
                            || z[i][j].equals("EV0") || z[i][j].equals("PM") || z[i][j].equals("PM")) {
                        z[i][j] = "R";
                    } else {
                        System.out.println("Error, posicion incorrecta");
                    }
                }
            }
        }
        return z;
    }

    @Override
    public String[][] atacar(String[][] z, int x, int y, int ox, int oy) {
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[0].length; j++) {
                if (ox==x||oy==y||Math.abs(oy-oy+2)==Math.abs(ox-ox+2)) {
                    z[i][j]=" ";
                }
            }
        }
        return z;
    }

}
