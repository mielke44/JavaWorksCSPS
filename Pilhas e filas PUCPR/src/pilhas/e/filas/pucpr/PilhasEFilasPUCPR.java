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
        //System.out.println("Entre com a expressão a ser testada!");
        //String a = s.next();
        //if(Expressão.validate(a))System.out.println("Expressão valida!");
        //else System.out.println("Expressão invalida!");
        Fila a = Fila.inicializa(10);
        Fila b = Fila.inicializa(7);
        a.insere(12);
        a.insere(35);
        a.insere(52);
        a.insere(64);
        a.insere(72);
        a.insere(85);
        a.insere(102);
        a.insere(124);
        a.insere(150);
        a.insere(204);
        b.insere(1);
        b.insere(2);
        b.insere(3);
        b.insere(4);
        b.insere(5);
        b.insere(95);
        b.insere(105);
        System.out.println("Filas originais:");
        a.imprime();
        b.imprime(); 
        System.out.println("Fila de união:");
        Merge.merge(a,b).imprime();
        System.out.println("Filas originais após o merge:");
        a.imprime();
        b.imprime();
    }
}
