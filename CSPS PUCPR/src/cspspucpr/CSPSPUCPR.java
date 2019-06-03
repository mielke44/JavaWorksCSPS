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
        System.out.print("Entre com o tamanho da tabela Hash: ");
        TabelaHash tab1 = new TabelaHash(s.nextInt());
        tab1.randPop();
        tab1.print();
        System.out.print("Entre com o valor a ser buscado na tabela Hash: ");
        int o = s.nextInt();
        while(o!=-1){
            if(tab1.busca(o))System.out.println("O valor: "+o+" existe na tabela de Hash!");
            else System.out.println("O valor: "+o+" não existe na tabela de Hash!");
            System.out.print("Entre com o valor a ser buscado na tabela Hash: ");
            o = s.nextInt();
        }
    }   
}
