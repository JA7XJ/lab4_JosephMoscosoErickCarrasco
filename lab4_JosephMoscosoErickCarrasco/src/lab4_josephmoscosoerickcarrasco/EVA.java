package lab4_josephmoscosoerickcarrasco;

import java.awt.Color;

/**
 *
 * @author erick
 */
public abstract class EVA {
    private Color color;
    private int productionDate;
    private double altura;
    private String alma;
    private int ojos;
    private String pais;
    private int serie;
    private double porcentajedamage;
    private Piloto piloto;
    
    public EVA() {
    }

    public EVA(Color color, int productionDate, double altura, String alma, int ojos, String pais, int serie, double porcentajedamage, Piloto piloto) {
        this.color = color;
        this.productionDate = productionDate;
        this.altura = altura;
        this.alma = alma;
        this.ojos = ojos;
        this.pais = pais;
        this.serie = serie;
        this.porcentajedamage = porcentajedamage;
        this.piloto = piloto;
    }

    public EVA(Color color, int productionDate, double altura, String alma, int ojos, String pais, int serie, double porcentajedamage) {
        this.color = color;
        this.productionDate = productionDate;
        this.altura = altura;
        this.alma = alma;
        this.ojos = ojos;
        this.pais = pais;
        this.serie = serie;
        this.porcentajedamage = porcentajedamage;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public double getPorcentajedamage() {
        return porcentajedamage;
    }

    public void setPorcentajedamage(double porcentajedamage) {
        this.porcentajedamage = porcentajedamage;
    }

    @Override
    public String toString() {
        return "EVA{" + "color=" + color + ", productionDate=" + productionDate + ", altura=" + altura + ", alma=" + alma + ", ojos=" + ojos + ", pais=" + pais + ", serie=" + serie + ", porcentajedamage=" + porcentajedamage + '}';
    }
    public abstract String[][] movimiento(String[][] x);
    public abstract String[][] atacar(String[][] x);
    
}
