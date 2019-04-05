/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cspspucpr;

/**
 *
 * @author wilsonmielke
 */
public class Merge {
    public static Fila merge(Fila a, Fila b){
        Fila c = Fila.inicializa(a.dados.length+b.dados.length);
        for(int i = 0;i<a.dados.length;i++){
            while(i==a.getPrimeiro()){
                if(b.vazia()){
                    c.insere(a.dados[i]);
                    a.remove();
                }else if(a.dados[i]<b.dados[b.getPrimeiro()]){
                    c.insere(a.dados[i]);
                    a.remove();
                }else if(a.dados[i]>b.dados[b.getPrimeiro()]){
                    c.insere(b.dados[b.getPrimeiro()]);
                    b.remove();
                }else if(a.dados[i]==b.dados[b.getPrimeiro()]){
                    c.insere(a.dados[i]);
                    c.insere(a.dados[i]);
                    a.remove();
                    b.remove();
                }
            }
        }
        while(!b.vazia()){
            c.insere(b.dados[b.getPrimeiro()]);
            b.remove();
        }
        return c;
    }
}
