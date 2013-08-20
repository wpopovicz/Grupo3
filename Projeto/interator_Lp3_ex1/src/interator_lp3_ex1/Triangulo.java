/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interator_lp3_ex1;

import java.util.logging.Logger;

/**
 *
 * @author willian
 */
public class Triangulo implements Figura {
    private double altura;
    private double base;

    public Triangulo() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    public Double CalculaPerimetro(){
        Double resultado = ((Math.sqrt(Math.pow(this.base, 2)))+(Math.sqrt(Math.pow(this.altura, 2))));
        return resultado;
    }

    @Override
    public double CalculaArea() {
        double resultado = (this.base*(this.altura/2));
        return resultado; 
    }


}
