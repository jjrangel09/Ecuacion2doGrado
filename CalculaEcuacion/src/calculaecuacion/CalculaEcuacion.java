/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaecuacion;

/**
 *
 * @author JuanJ
 */
public class CalculaEcuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte a = 1;
        byte b = 8;
        byte c = 12;
        byte x1 ;
        byte x2 ;
        byte raiz = (byte) Math.sqrt(Math.pow(b, 2)-(4*a*c));
        byte temp;
        
        
        x1 = (byte) (( -b + raiz)/(2*a)); 
        x2 = (byte) (( -b - raiz)/(2*a)); 
        
        System.out.println("Calculo de Ecuacion de Segundo Grado\nX^2+8X+12=0\n");
        System.out.println("Primera solucion: X1= " + x1);
        System.out.println("Segunda solucion: X2= " + x2 + "\n");
        
        System.out.println("COMPROBACION:\n");
        temp = (byte) (Math.pow(x1,2)+(8*x1)+12);
        System.out.println(x1 +"^2+8" + "(" + x1 + ")" + "+12=" + temp);
 
        temp = (byte) (Math.pow(x2,2)+(8*x2)+12);
        System.out.println(x2 +"^2+8" + "(" + x2 + ")" + "+12=" + temp);
    }
    
}
