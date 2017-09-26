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

    protected double eixoX, eixoY;
    
    public Elipse(){}
    
    public Elipse(double eiX, double eiY){
        this.eixoX = eiX;
        this.eixoY = eiY;
    }
    
    @Override
    public double getEixoMenor() {
        if(this.eixoX < this.eixoY){
            return this.eixoX;
        }
        
        else{
            return this.eixoY;
        }
    }

    @Override
    public double getEixoMaior() {
        if(this.eixoX > this.eixoY){
            return this.eixoX;
        }
        
        else{
            return this.eixoY;
        }
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getPerimetro() {
        double resultado;
        
        resultado = Math.PI *(  3*(this.eixoX + this.eixoY)  -  Math.sqrt((3*this.eixoX + this.eixoY)  *  (this.eixoX + 3* this.eixoY) ) );
        
        return resultado;
    }

    @Override
    public double getArea() {
        double resultado;
        
        resultado = Math.PI * this.eixoX * this.eixoY;
        
        return resultado;
    }

}
