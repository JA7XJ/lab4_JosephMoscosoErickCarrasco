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
public class eva02 extends EVA {

    public eva02() {
        super();
    }

    public eva02(Color color, int productionDate, double altura, String alma, int ojos, String pais, int serie, double porcentajedamage, Piloto piloto) {
        super(color, productionDate, altura, alma, ojos, pais, serie, porcentajedamage, piloto);
    }

    public eva02(Color color, int productionDate, double altura, String alma, int ojos, String pais, int serie, double porcentajedamage) {
        super(color, productionDate, altura, alma, ojos, pais, serie, porcentajedamage);
    }

    @Override
    public String[][] movimiento(String[][] z, int x, int y) {
        int posx = x;
        int posy = y;
        if (z[x][y].equals("R") || z[x][y].equals("R") || z[x][y].equals("Z") || z[x][y].equals("Z")
                || z[x][y].equals("S") || z[x][y].equals("S") || z[x][y].equals("Z") || z[x][y].equals("Z")
                || z[x][y].equals("PM") || z[x][y].equals("PM") || z[x][y].equals("EV0") || z[x][y].equals("EV1") || z[x][y].equals("EV2")
                || z[x][y].equals("EV0") || z[x][y].equals("PM") || z[x][y].equals("PM")) {
            System.out.println("Error, posicion incorrecta");

        }if (x== posx+1 && y == posy+2) {
            z[x][y]= "EV2";
        }
        if (x==posx+2 && y == posy+1) {
            z[x][y]= "EV2";
        }
        if (x==posx+1 && y == posy-2) {
            z[x][y]= "EV2";
        }
        if (x==posx+2 && y == posy-1) {
            z[x][y]= "EV2";
        }
        if (x == posx-1 && y == posy+2) {
            z[x][y]= "EV2";
        }
        if (x== posx-2 && y == posy+1) {
            z[x][y]= "EV2";
        }
        if (x== posx-1 && y == posy-2) {
            z[x][y]= "EV2";
        }
        if (x==posx-2 && y == posy-1) {
            z[x][y]= "EV2";
        }
        return z;
    }

    @Override
    public String[][] atacar(String[][] z, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
