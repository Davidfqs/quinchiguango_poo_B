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
public class Circulo {
    private Punto p;
    private Linea radio;

    public Circulo() {
    }

    public Circulo(Punto p, Linea radio) {
        this.p = p;
        this.radio = radio;
    }

    public Punto getP() {
        return p;
    }

    public void setP(Punto p) {
        this.p = p;
    }

    public Linea getRadio() {
        return radio;
    }

    public void setRadio(Linea radio) {
        this.radio = radio;
    }
    
    
    
}
