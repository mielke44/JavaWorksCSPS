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
public class Node {
    private Node NextNode;
    private Integer Info;
    public Node(Integer info, Node next){
        this.Info=info;
        this.NextNode = next;
    }
    public Node getNext(){
        return this.NextNode;
    }
    public void SetNext(Node next){
        this.NextNode = next;
    }
    public Integer getInfo(){
        return this.Info;
    }
    public void setInfo(Integer info){
        this.Info = info;
    }
}
