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
public class ArvoreBinariaBalanceada {
    private NodeBin raiz;

    public static int altura(NodeBin no){
        if (no == null)return -1;
        int L = altura(no.getEsquerda());
        int R = altura(no.getDireita());
        if(L>R)return 1+L;
        return 1+R;
    }
    
    public NodeBin getRaiz() {
        return raiz;
    }

    public void setRaiz(NodeBin raiz) {
        this.raiz = raiz;
    }
    
    public void insere(int elemento){
        NodeBin no = new NodeBin(elemento);
        if(this.raiz==null){
            this.raiz=no;
            return;
        }
        NodeBin node = this.raiz;
        while(!existe(elemento)){
            if(elemento>node.getInfo()){
                if(node.getDireita()==null)node.setDireita(no);
                else node=node.getDireita();
            }else {
                if(node.getEsquerda()==null)node.setEsquerda(no);
                else node=node.getEsquerda();
            }
        }
        balancear(this.raiz,null);
    }
    
    
    

    
    public Boolean existe(int elemento){
        NodeBin node = this.raiz;
        while(node!=null && node.getInfo()!=elemento){
            if(node.getDireita()==null && node.getEsquerda()==null)return false;
            if(node.getInfo()>elemento)node=node.getEsquerda();
            else node = node.getDireita();
        }
        if(node==null)return false;
        return true;
    }
    
    public void remove(int elemento){
        NodeBin preNode = null;
        NodeBin node = this.raiz;
        NodeBin sub;
        NodeBin preSub;
        if(!existe(elemento)){
            System.out.println("O nó não existe!");
            return;
        }
        while(existe(elemento)){
            if(elemento==node.getInfo()){
                break;
            }else if(elemento>node.getInfo() && node.temDir()){
                preNode = node;
                node=node.getDireita();
                if(!node.temEsq() && !node.temDir())preNode.setDireita(null);
            }
            else if(elemento<node.getInfo() && node.temEsq()){
                preNode = node;
                node=node.getEsquerda();
                if(!node.temEsq() && !node.temDir())preNode.setEsquerda(null);
            }
        }
        if(node.temEsq()){
            preSub=node;
            sub = node.getEsquerda();
            while(sub.temDir()){
                preSub = sub;
                sub = sub.getDireita();
            }
            if(sub.temDir())sub.setDireita(null);
            else preSub.setEsquerda(sub.getEsquerda());
            preSub.setInfo(sub.getInfo());
        }
        else if(node.temDir()){
            preSub=node;
            sub = node.getDireita();
            while(sub.temEsq()){
                preSub = sub;
                sub = sub.getEsquerda();
            }
            if(sub.temEsq())sub.setEsquerda(null);
            else preSub.setDireita(sub.getDireita());
            node.setInfo(sub.getInfo());
        }
        balancear(this.raiz,null);
    }
    
    public void rotaEsq(NodeBin node,NodeBin parent){
        NodeBin nodeRaiz = node.getDireita();
        NodeBin temp = nodeRaiz.getEsquerda();
        nodeRaiz.setEsquerda(node);
        node.setDireita(temp);
        if(parent==null) this.raiz=nodeRaiz;
        else parent.setDireita(nodeRaiz);
        System.out.println("Arvore Rotacionada para esquerda");
    }
    
    public void rotaDir(NodeBin node,NodeBin parent){
        NodeBin nodeRaiz = node.getEsquerda();
        NodeBin temp = nodeRaiz.getDireita();
        nodeRaiz.setDireita(node);
        node.setEsquerda(temp);
        parent.setEsquerda(nodeRaiz);
        System.out.println("Arvore Rotacionada para direita");
    }
    
    public void balancear(NodeBin node,NodeBin parent){
        if(node.avl()>1)rotaDir(node,parent);
        else if(node.avl()<-1)rotaEsq(node,parent);
        else {
            if(node.temEsq())balancear(node.getEsquerda(),node);
            if(node.temDir())balancear(node.getDireita(),node);
        }
        if(node==this.raiz)System.out.println("Arvore Balanceada!");
    }
    
    public void preIterator(NodeBin node){
        System.out.print(node.getInfo()+ ", ");
        if(node.temEsq())preIterator(node.getEsquerda());
        if(node.temDir())preIterator(node.getDireita());
    }
    public void inIterator(NodeBin node){
        if(node.temEsq())inIterator(node.getEsquerda());
        System.out.print(node.getInfo()+ ", ");
        if(node.temDir())inIterator(node.getDireita());
    }
    
    public void posIterator(NodeBin node){
        if(node.temEsq())posIterator(node.getEsquerda());
        if(node.temDir())posIterator(node.getDireita());
        System.out.print(node.getInfo()+ ", ");
    }

}
