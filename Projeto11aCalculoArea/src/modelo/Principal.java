/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author yuril
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo ret00 = new Retangulo(1 , 2);
        Retangulo ret01 = new Retangulo(3 , 4);
        Retangulo ret02 = new Retangulo(5 , 6);
        Retangulo ret03 = new Retangulo(7 , 8);
        Retangulo ret04 = new Retangulo(9 , 10);
        
        ArrayList<Retangulo> listaRetangulo = new ArrayList<>();
        listaRetangulo.add(ret00);
        listaRetangulo.add(ret01);
        listaRetangulo.add(ret02);
        listaRetangulo.add(ret03);
        listaRetangulo.add(ret04);
        
        for(int i = 0; i < listaRetangulo.size(); i++){
            System.out.println("Retangulo " + i + "\nBase = " + listaRetangulo.get(i).getBase() + "\n" + "Altura = " +
                                                         listaRetangulo.get(i).getAltura() + "\nÁrea = " +
                                                         listaRetangulo.get(i).calcularArea(listaRetangulo.get(i).getBase(), listaRetangulo.get(i).getAltura()) + " Perímetro = " +
                                                         listaRetangulo.get(i).calcularPerimetro(listaRetangulo.get(i).getBase(), listaRetangulo.get(i).getAltura()) + "\n");
        }
    }
    
}
