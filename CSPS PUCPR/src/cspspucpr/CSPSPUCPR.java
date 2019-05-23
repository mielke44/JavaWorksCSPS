/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cspspucpr;
import static cspspucpr.ArvoreBinariaBalanceada.altura;
import java.util.Scanner;

/**
 *
 * @author wilsonmielke
 */
public class CSPSPUCPR {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        ArvoreBinariaBalanceada abb = new ArvoreBinariaBalanceada();
        abb.insere(1);
        abb.insere(2);
        abb.insere(3);
        abb.insere(4);
        abb.insere(5);
        abb.insere(6);
        abb.insere(7);
        abb.insere(8);
        abb.insere(9);
        abb.insere(10);
        abb.insere(11); 
        //arvore balanceada gerada
        abb.preIterator(abb.getRaiz());
        System.out.println("");
        //iterando em modo pré-ordem para melhor vizualização
        abb.inIterator(abb.getRaiz());
        System.out.println("");
        //iterando em modo in-ordem para ver a ordem crescente 
        abb.posIterator(abb.getRaiz());
        System.out.println("");
        //iterando em pos-ordem.
        abb.remove(8);
        /* Removendo o nó interno com informação 8; 
         * o nó que deverá substituir deve ser o com informação 7
         * e o nó direito deve ser o 10, e o esquerdo o 6;
         */
        abb.preIterator(abb.getRaiz());
        System.out.println("");
        //iterando em modo pré-ordem para melhor vizualização das operações
        System.out.println("Existe um nó com o elemento 8:"+abb.existe(8));
        //mostrando que o 8 foi removido
        System.out.println("Altura: "+altura(abb.getRaiz()));
        //imprimindo a altura total da arvore
    }   
}
