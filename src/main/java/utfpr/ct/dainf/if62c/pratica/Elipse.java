/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.io.Serializable;

/**
 *
 * @author woich
 */
public class Elipse implements FiguraComEixos,Serializable {

    private double eixoMais, eixoMenos;
    
    public void setEixoMais(double eixoMais) {
        this.eixoMais = eixoMais;
    }

    public void setEixoMenos(double eixoMenos) {
        this.eixoMenos = eixoMenos;
    }
    
    @Override
    public double getEixoMenor() {
        return eixoMenos/2;
    }

    @Override
    public double getEixoMaior() {
        return eixoMais/2;
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString() {
        return this.getNome();
    }

}
