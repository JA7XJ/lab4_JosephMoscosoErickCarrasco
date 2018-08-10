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
public class eva00 extends EVA {

    public eva00() {
        super();
    }

    public eva00(Color color, int productionDate, double altura, String alma, int ojos, String pais, int serie, double porcentajedamage, Piloto piloto) {
        super(color, productionDate, altura, alma, ojos, pais, serie, porcentajedamage, piloto);
    }

    public eva00(Color color, int productionDate, double altura, String alma, int ojos, String pais, int serie, double porcentajedamage) {
        super(color, productionDate, altura, alma, ojos, pais, serie, porcentajedamage);
    }

    @Override
    public String[][] movimiento(String[][] z, int x, int y) {
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[0].length; j++) {
                if (y == i && x == j) {
                    if (y == i + 1 && x == j + 1 && z[i][j].equals("R") || z[i][j].equals("R") || z[i][j].equals("Z") || z[i][j].equals("Z")
                            || z[i][j].equals("S") || z[i][j].equals("S") || z[i][j].equals("Z") || z[i][j].equals("Z")
                            || z[i][j].equals("PM") || z[i][j].equals("PM") || z[i][j].equals("EV0") || z[i][j].equals("EV1") || z[i][j].equals("EV2")
                            || z[i][j].equals("EV0") || z[i][j].equals("PM") || z[i][j].equals("PM")) {
                        z[i][j] = "EV0";
                    } else {
                        System.out.println("Error, posicion incorrecta");
                    }
                }
            }
        }
        return z;
    }

    @Override
    public String[][] atacar(String[][] z, int x, int y) {
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[0].length; j++) {
                if (y == i && x == j) {
                    
                }
            }
        }
        return z;
    }

}
