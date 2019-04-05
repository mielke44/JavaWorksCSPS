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
public class Expressão {
    public static boolean validate(String s){
        Pilha p = Pilha.cria_pilha(s.length());
        for(int i = 0;i<s.length();i++){
            switch(s.charAt(i)){
                case ' ':
                    break;
                case '{':
                    p.empilha('{');
                    break;
                case '}':
                    if(p.desempilha()==123){ //int code for '{'
                        break;
                    }else return false;
                case '[':
                    p.empilha('[');
                    break;
                case ']':
                    if(p.desempilha()==91){ //int code for '['
                        break;
                    }else return false;  
                case '(':
                    p.empilha('(');
                    break;
                case ')':
                    if(p.desempilha()==40){ //int code for '('
                        break;
                    }else return false; 
                default:
                    break;
            }
        }
        if(p.vazia())return true;
        else return false;    
    }
}
