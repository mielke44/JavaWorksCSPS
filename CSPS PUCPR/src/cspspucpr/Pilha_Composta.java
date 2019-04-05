package cspspucpr ;

public class Pilha_Composta {
    private Node topo;
    private ListaEncadeada dados;
    private int count;
    
    public Pilha_Composta(){
        this.topo = null;
        this.dados = new ListaEncadeada(null);
        this.count = 0;
    }
    public void empilha(Integer dado){
        this.count++;
        this.dados.addLast(dado);
        Node node=this.dados.getFirst();
        while(node.getNext()!=null)node=node.getNext();
        this.topo=node;
    }
    public int desempilha(){
        int v = this.dados.removeLast().getInfo();
        Node node=this.dados.getFirst();
        while(node.getNext()!=null)node=node.getNext();
        this.topo=node;
        return v;
    }
    public int topo(){
        Node node = this.dados.getFirst();
        while(node.getNext()!=null)node = node.getNext();
        return node.getInfo();
    }
    public void mostra_pilha(){
        this.dados.print();
    }
}
