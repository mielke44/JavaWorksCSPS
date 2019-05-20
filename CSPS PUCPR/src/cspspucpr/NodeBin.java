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
    
}
