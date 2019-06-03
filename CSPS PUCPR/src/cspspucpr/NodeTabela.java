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
public class NodeTabela {
    private int Info;
    private ListaEncadeada lista;

    public NodeTabela(int info){
        this.Info=info;
        this.lista = new ListaEncadeada(null);
    }
    
    public int getInfo() {
        return Info;
    }

    public void setInfo(int Info) {
        this.Info = Info;
    }

    public ListaEncadeada getLista() {
        return lista;
    }

    public void setLista(ListaEncadeada lista) {
        this.lista = lista;
    }
    
}
