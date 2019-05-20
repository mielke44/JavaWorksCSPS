/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cspspucpr;
import java.util.Scanner;

/**
 *
 * @author wilsonmielke
 */
public class CSPSPUCPR {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Testando Pilha:");
        Pilha_Composta pc = new Pilha_Composta();
        pc.mostra_pilha();
        pc.empilha(3);
        pc.empilha(4);
        pc.empilha(5);
        pc.empilha(6);
        pc.empilha(7);
        pc.empilha(8);
        pc.mostra_pilha();
        System.out.println(pc.desempilha());
        System.out.println(pc.desempilha());
        System.out.println(pc.desempilha());
        pc.mostra_pilha();
        pc.empilha(6);
        pc.empilha(7);
        pc.empilha(8);
        pc.mostra_pilha();
        System.out.println("Testando Fila:");
        Fila_Composta fc = new Fila_Composta();
        fc.mostra_fila();
        fc.insere(3);
        fc.insere(4);
        fc.insere(5);
        fc.insere(6);
        fc.insere(7);
        fc.insere(8);
        fc.mostra_fila();
        System.out.println(fc.remove());
        System.out.println(fc.remove());
        System.out.println(fc.remove());
        fc.mostra_fila();
        fc.insere(6);
        fc.insere(7);
        fc.insere(8);
        fc.mostra_fila();
    }   
}
