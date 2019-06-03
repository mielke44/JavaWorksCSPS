/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cspspucpr;
import java.util.Random;

/**
 *
 * @author wilsonmielke
 */
public class TabelaHash {
    private int colision;
    private NodeTabela[] tabela;

    public TabelaHash(int tam) {
        this.colision = 0;
        this.tabela = new NodeTabela[tam];
        initPopulate();
    }
    
    private void initPopulate(){
        for(int i=0;i<this.tabela.length;i++)this.tabela[i] = new NodeTabela(-1);
        
    }
    
    public void randPop(){
        Random rand = new Random();
        int i=0;
        while(i<0.9*this.tabela.length){
            i++;
            insere(rand.nextInt(1000000));
        }
    }
    
    public void insere(int chave){
        if(this.tabela[chave%this.tabela.length].getInfo()!=-1){
            this.colision++;
            this.tabela[chave%this.tabela.length].getLista().addFirst(chave);
        }else this.tabela[chave%this.tabela.length].setInfo(chave);
    }
    
    public void print(){
        for(int i=0;i<this.tabela.length;i++){
            System.out.print(i+"   "+this.tabela[i].getInfo());
            Node node = this.tabela[i].getLista().getFirst();
            while(node!=null){
                System.out.print("   "+node.getInfo());
                node=node.getNext();
            }
            System.out.println();
        }
    }
    
    public boolean busca(int chave){
        for(NodeTabela nt: this.tabela){
            if(nt.getInfo()==chave)return true;
            else if(nt.getLista().exists(chave))return true;
        }
        return false;
    }
    
    public int getColision() {
        return colision;
    }

    public void setColision(int Colision) {
        this.colision = Colision;
    }

    public NodeTabela[] getTabela() {
        return tabela;
    }

    public void setTabela(NodeTabela[] tabela) {
        this.tabela = tabela;
    }
    
}
