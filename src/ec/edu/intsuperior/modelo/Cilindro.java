/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author David
 */
public class Cilindro {
    private Circulo circulo;
    private Linea linea;

    public Cilindro() {
    }

    public Cilindro(Circulo circulo, Linea linea) {
        this.circulo = circulo;
        this.linea = linea;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }
    
    
}
