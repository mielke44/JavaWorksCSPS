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
public class Fila_Composta {
    private int primeiro;
    private int ultimo;
    private int nItens;
    protected ListaEncadeada dados;
    
    public Fila_Composta(){
        this.dados = new ListaEncadeada(null);
        this.primeiro = 0;
        this.ultimo = -1;
        this.nItens = 0;
    }
    
    public void insere(int E)throws NullPointerException{
        try{
            this.nItens++;
            this.ultimo++;
            this.dados.addLast(E);
        }catch(NullPointerException e){
            System.out.println("não foi possível adicionar o registro!");
        }
    }
    
    public int remove() throws ArrayIndexOutOfBoundsException{
        try{
            this.primeiro++;
            this.nItens--;
            return this.dados.removeFirst().getInfo();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A fila está vazia!");
            return 0;
        }
    }
    
    public void mostra_fila(){
        this.dados.print();
    }
}
