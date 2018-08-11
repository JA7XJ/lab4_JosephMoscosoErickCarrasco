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
public class eva01 extends EVA{

    public eva01() {
        super();
    }

    public eva01(Color color, int productionDate, double altura, String alma, int ojos, String pais, int serie, double porcentajedamage, Piloto piloto) {
        super(color, productionDate, altura, alma, ojos, pais, serie, porcentajedamage, piloto);
    }
    
    public eva01(Color color, int productionDate, double altura, String alma, int ojos, String pais, int serie, double porcentajedamage) {
        super(color, productionDate, altura, alma, ojos, pais, serie, porcentajedamage);
    }
    
    @Override
    public String[][] movimiento(String[][] z, int x, int y, int ox, int oy) {
        if (z[x][y].equals("R") || z[x][y].equals("R") || z[x][y].equals("Z") || z[x][y].equals("Z")
                || z[x][y].equals("S") || z[x][y].equals("S") || z[x][y].equals("Z") || z[x][y].equals("Z")
                || z[x][y].equals("PM") || z[x][y].equals("PM") || z[x][y].equals("EV0") || z[x][y].equals("EV1") || z[x][y].equals("EV2")
                || z[x][y].equals("EV0") || z[x][y].equals("PM") || z[x][y].equals("PM")) {
            System.out.println("Error, posicion incorrecta");

        }
        if (ox+3==x && oy+3==y) {
            z[x][y]= "EV1";
            z[ox][oy]=" ";
        }
        if (ox+3==x && oy==y) {
            z[x][y]= "EV1";
            z[ox][oy]=" ";
        }
        if (ox==x && oy+3==y) {
            z[x][y]= "EV1";
            z[ox][oy]=" ";
        }
        if (ox-3==x && oy-3==y) {
            z[x][y]= "EV1";
            z[ox][oy]=" ";
        }
        if (ox-3==x && oy+3==y) {
            z[x][y]= "EV1";
            z[ox][oy]=" ";
        }
        if (ox+3==y && oy-3==y) {
            z[x][y]= "EV1";
            z[ox][oy]=" ";
        }
        
        return z;
    }

    @Override
    public String[][] atacar(String[][] z, int x, int y, int ox, int oy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
