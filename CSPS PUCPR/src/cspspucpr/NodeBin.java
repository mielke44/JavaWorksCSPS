/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cspspucpr;

import static cspspucpr.ArvoreBinariaBalanceada.altura;

/**
 *
 * @author wilsonmielke
 */
public class NodeBin {
    private int info;
    private NodeBin esquerda;
    private NodeBin direita;

    public NodeBin(int info) {
        this.info = info;
    }
    
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NodeBin getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NodeBin esquerda) {
        this.esquerda = esquerda;
    }

    public NodeBin getDireita() {
        return direita;
    }

    public void setDireita(NodeBin direita) {
        this.direita = direita;
    }
    
    public boolean temDir(){
        return this.getDireita() != null;
    }
    
    public boolean temEsq(){
        return this.getEsquerda() != null;
    }
    
    public void print(){
        System.out.println("info:"+this.getInfo());
        if(this.temEsq()){
            System.out.println("info Esquerda:"+this.getEsquerda().getInfo());
        }
        if(this.temDir()){
            System.out.println("info Direita:"+this.getDireita().getInfo());
        }
        System.out.println("Balanceamento:"+this.avl());
    }
    
    public int avl(){
        return altura(this.getEsquerda()) - altura(this.getDireita());
    }
}
