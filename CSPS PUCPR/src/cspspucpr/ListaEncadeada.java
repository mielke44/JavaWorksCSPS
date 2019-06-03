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
public class ListaEncadeada {
    private Node First;
    public ListaEncadeada(Node first){
        this.First = first;
    }
    public Node getNodeByInfo(int Info){
        try{
            Node node = this.First;
            while(node.getInfo()!=Info)node = node.getNext();
            return node;
        }catch(NullPointerException e){
            System.out.println("Esse node não existe!");
            return null;
        }
    }
    
    public boolean exists(int key){
        Node node=this.First;
        while(node!=null){
            if(node.getInfo()==key)return true;
            node=node.getNext();
        }
        return false;
    }
    
    public boolean isEmpty(){
        return this.First==null;
    }
    public void addFirst(int Info){
        this.First = new Node(Info,this.First);
    }
    public void addAfter(Node node,int Info){
        node.SetNext(new Node(Info,node.getNext()));
    }
    public void addLast(int Info){
        if(this.isEmpty()){
            this.First = new Node(Info,null);
            return;
        }
        Node node=this.First;
        while(node.getNext()!=null)node = node.getNext();
        node.SetNext(new Node(Info,null));
    }
    public void addOrdered(int Info){
            Node lastNode = null;
            Node node = this.First;
            if(node.getInfo()>Info){
                this.addFirst(Info);
                return;
            }
            while(node.getInfo()<Info){
                lastNode=node;
                if(node.getNext()==null){
                    node.SetNext(new Node(Info,null));
                    return;
                }
                node=node.getNext();
            }
            lastNode.SetNext(new Node(Info,node));

    }
    public void print(){
        try{
            Node node = this.First;
            System.out.print('[');
            System.out.print(node.getInfo());
            while(node.getNext()!=null){
                node = node.getNext();
                System.out.print(',');
                System.out.print(node.getInfo());
            }
            System.out.println(']');
        }catch(NullPointerException e){
            System.out.print("A lista está vazia!");
            System.out.println(']');
        }
    }
    public Node removeFirst(){
        Node removedNode = this.First;
        this.First = this.First.getNext();
        return removedNode;
    }
    public Node removeLast(){
        Node node = this.First;
        Node lastNode = null;
        while(node.getNext()!=null){
            lastNode = node;
            node = node.getNext();
        }
        lastNode.SetNext(null);
        return node;
    }
    public Node remove(Node removedNode){
        Node node =this.First;
        while(node.getNext()!=removedNode)node=node.getNext();
        node.SetNext(removedNode.getNext());
        return removedNode;
    }

    public Node getFirst() {
        return First;
    }
    
}
