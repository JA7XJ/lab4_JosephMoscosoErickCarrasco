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
    public void movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
