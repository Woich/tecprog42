
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woich
 */
public class Pratica42 {
    public static void main(String args[]){
        Elipse eli = new Elipse(2.5 , 3);
        
        System.out.println("Area da Elipse: " + eli.getArea());
        System.out.println("Perimetro da Elipse: " + eli.getPerimetro());
        System.out.println();
        
        
        
        Circulo circ = new Circulo(3);
        
        
        System.out.println("Area do Circulo: " + eli.getArea());
        System.out.println("Perimetro do Circulo: " + circ.getPerimetro());
        System.out.println();
    }
}
