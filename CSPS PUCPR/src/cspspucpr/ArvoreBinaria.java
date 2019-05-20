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
public class ArvoreBinaria {
    private NodeBin raiz;

    public NodeBin getRaiz() {
        return raiz;
    }

    public void setRaiz(NodeBin raiz) {
        this.raiz = raiz;
    }
    
    public void insere(int elemento){
        NodeBin no = new NodeBin(elemento);
        NodeBin node = this.raiz;
        if(node.getDireita()!=null && node.getEsquerda()!=null){
            if(elemento>node.getInfo() && node.getDireita()!=null)node=node.getDireita();
            else if(elemento>node.getInfo())node.setDireita(no);
            if(elemento<=node.getInfo() && node.getEsquerda()!=null)node=node.getEsquerda();
            else if(elemento<=node.getInfo())node.setEsquerda(no);
        }
        while(node.getDireita()!=null || node.getEsquerda()!=null){
            if(elemento>node.getInfo() && node.getDireita()!=null)node=node.getDireita();
            else if(elemento>node.getInfo())node.setDireita(no);
            if(elemento<=node.getInfo() && node.getEsquerda()!=null)node=node.getEsquerda();
            else if(elemento<=node.getInfo())node.setEsquerda(no);
        }
        balancear(this.raiz);
    }
    
    
    
    public static int altura(NodeBin no){
        if (no == null)return -1;
        int L = altura(no.getEsquerda());
        int R = altura(no.getDireita());
        if(L>R)return 1+L;
        return 1+R;
    }
    
    public Boolean existe(int elemento){
        NodeBin node = this.raiz;
        while(node!=null && node.getInfo()!=elemento){
            if(node.getDireita()==null && node.getEsquerda()==null)return false;
            if(node.getInfo()>elemento)node=node.getEsquerda();
            else node = node.getDireita();
        }
        return true;
    }
    
    public void remove(int elemento){
        NodeBin preNode = null;
        NodeBin node = this.raiz;
        NodeBin sub = null;
        NodeBin preSub = null;
        while(node.getDireita()!=null || node.getEsquerda()!=null){
            if(elemento==node.getInfo()){
                break;
            }else if(elemento>node.getInfo() && node.getDireita()!=null){
                preNode = node;
                node=node.getDireita();
            }
            else if(elemento<node.getInfo() && node.getEsquerda()!=null){
                preNode = node;
                node=node.getEsquerda();
            }
            else System.out.println("Não existe um nó com este valor!");
        }
        if(node.getEsquerda()!=null){
            sub = node.getEsquerda();
            while(sub.getDireita()!=null){
                preSub = sub;
                sub = sub.getDireita();
            }
            node.setInfo(sub.getInfo());
            preSub.setDireita(null);
        }
        else if(node.getDireita()!=null){
            sub = node.getDireita();
            while(sub.getEsquerda()!=null){
                preSub = sub;
                sub = sub.getEsquerda();
            }
            preSub.setEsquerda(null);
            node.setInfo(sub.getInfo());
        }
        else if(preNode.getInfo()>elemento)preNode.setDireita(null);
        else preNode.setEsquerda(null);
        balancear(this.raiz);
    }

    public int avl(NodeBin node){
        return altura(node.getEsquerda())-altura(node.getDireita());
    }
    
    public void rotaEsq(NodeBin node){
        NodeBin nodeRaiz = node.getDireita();
        NodeBin temp = nodeRaiz.getEsquerda();
        nodeRaiz.setEsquerda(node);
        node.setDireita(temp);
    }
    
    public void rotaDir(NodeBin node){
        NodeBin nodeRaiz = node.getEsquerda();
        NodeBin temp = nodeRaiz.getDireita();
        nodeRaiz.setDireita(node);
        node.setEsquerda(temp);
    }
    
    public void balancear(NodeBin node){
        if(avl(node)>1)rotaDir(node);
        else if(avl(node)<-1)rotaEsq(node);
        System.out.println("arvore Balançeada!");
    }
    
    public void percorre(NodeBin node, String Type){
        switch(Type){
                case("Pré"):
                    break;
                case("in"):
                    break;
                case("Pos"):
                    break;
        }
    }
}
