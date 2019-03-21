/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas.e.filas.pucpr;
import java.util.Scanner;
/**
 *
 * @author wilsonmielke
 */
public class PilhasEFilasPUCPR {
    static Scanner s = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entre com a expressão a ser testada!");
        String a = s.next();
        if(Expressão.validate(a))System.out.println("Expressão valida!");
        else System.out.println("Expressão invalida!");
    }
}
