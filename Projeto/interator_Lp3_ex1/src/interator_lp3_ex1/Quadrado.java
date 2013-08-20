/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interator_lp3_ex1;

/**
 *
 * @author willian
 */
public class Quadrado implements Figura{
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Double CalculaPerimetro(){
        Double resultado = (this.lado*4);
        return resultado;
    }

    @Override
    public double CalculaArea() {
        double resultado = (this.lado*this.lado);
        return resultado; 
    }
}
