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
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[0].length; j++) {
                if (true) {
                    
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
