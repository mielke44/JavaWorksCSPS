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
public class Fila {
    private int primeiro;
    private int ultimo;
    private int nItens;
    protected int dados[];
    
    public static Fila inicializa(int n){
        Fila f = new Fila();
        f.dados =new int[n];
        f.primeiro = 0;
        f.ultimo = -1;
        f.nItens = 0;
        return f;
    }
    public boolean cheia(){
        return this.nItens==this.dados.length;
    }
    public boolean vazia(){
        return this.nItens==0;
    }
    public void insere(int E)throws ArrayIndexOutOfBoundsException{
        try{
            this.nItens++;
            this.ultimo++;
            this.dados[this.ultimo] = E;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("não foi possível adicionar o registro!");
        }
    }
    public void remove() throws ArrayIndexOutOfBoundsException{
        try{
            this.dados[this.primeiro] = 0;
            this.primeiro++;
            this.nItens--;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A fila está vazia!");
        }
    }
    public void imprime(){
        System.out.print('[');
        for(int dado: this.dados){
            System.out.print(dado+" ");
        }
        System.out.println(']');
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public int getUltimo() {
        return ultimo;
    }
    
}
