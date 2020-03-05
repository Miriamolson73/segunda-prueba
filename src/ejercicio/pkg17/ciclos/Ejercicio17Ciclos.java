/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17.ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio17Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //float litros;
        double precioxlitro=1,preciofactura,litros;
        int codart,facTotal=0,cantlitros=0,contadorfactura=0;
        for(int i=1;i<=5;i++){
            codart=Integer.parseInt(JOptionPane.showInputDialog("articulo n "+i+"\n ingrese el codigo del articulo"));
            litros=Float.parseFloat(JOptionPane.showInputDialog("articulo n "+i+"\n ingrese los litros vendidos"));
                switch(codart){
                    case 1 : precioxlitro=0.60;
                             break;
                    case 2: precioxlitro=3.0;
                            break;
                    case 3: precioxlitro=1.25;
                            break;
                    default: JOptionPane.showMessageDialog(null,"codigo incorrecto");
                            break;
                }
            
            preciofactura=litros*precioxlitro;
            facTotal+=preciofactura;
            if(preciofactura>600){
                contadorfactura++;
            }
            if(codart==1){
                cantlitros+=litros;
            }
            
        }
        System.out.println("RESUMEN DE VENTAS  ");
        System.out.println("la facturacion total es  "+facTotal);
        System.out.println("la cantidad de litros del articulo 1 es "+cantlitros);
        System.out.println("la cantidad de  facturas de mas de 600 pesos es   "+contadorfactura);
    }
    
}
