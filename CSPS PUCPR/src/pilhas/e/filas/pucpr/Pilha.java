/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas.e.filas.pucpr;

/**
 *
 * @author wilsonmielke
 */
public class Pilha {
    private int topo;
    private int dados[];
    private int max;

    public static Pilha cria_pilha(int max) {
        Pilha p = new Pilha();
        p.dados = new int[max];
        p.max = max;
        p.topo = -1;
        return p;
    }
    public int Topo() {
        return this.topo;
    }
    public boolean vazia(){
        if(this.topo==-1){
            return true;
        };
        return false;
    }
    public boolean cheia(){
        if(this.topo==this.max-1){
            return true;
        };
        return false;
    }
    public void empilha(int Elemento) throws ArrayIndexOutOfBoundsException{
        try{
            this.topo++;
            this.dados[this.topo]=Elemento;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A pilha está cheia! Desempilhe para adicionar outro elemento!");
        }
        
    }
    public int desempilha() throws ArrayIndexOutOfBoundsException{
        try{
            int eletopo = this.dados[this.topo];
            this.dados[this.topo] = 0;
            this.topo--;
            return eletopo;
        }catch(ArrayIndexOutOfBoundsException e){
            return this.dados[0];
        }
    }
    public void print_pilha() throws NullPointerException{
        try{
            System.out.print('[');
            for(int i = 0;i<this.dados.length;i++){
                System.out.print(this.dados[i]+" ");
            }
            System.out.print(']');
        }catch(NullPointerException e){
            System.out.print("Pilha vazia, sem dados para imprimir!");
        }
    }
}
