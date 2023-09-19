// pilha adiciona  add no final(push), retira do final(pop), verifica se esta vazia(isEmpty).

import java.util.Stack;


public class Pilha{
    public static void Stacck (){
        int x;
        Stack <Integer> pilha = new Stack<Integer>();
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        
        while(!pilha.isEmpty()){
            x= pilha.pop();
            System.out.println(x);
        }
        
        }
    public static void Parenteses(){
        String expressao = "";
        Stack<Character> pilha = new Stack<Character>();

        int i; 
        char c;
        boolean erro;
        erro=false;

        for(i=0;i<expressao.length();i++){
            c = expressao.charAt(i);
        switch(c){
            case '(':
                pilha.push(c);
            break;
            case ')':
            if(pilha.isEmpty()){
                erro = true;
            }else{
                if(pilha.pop()!='('){
                    erro = true;
                }
            }
            break;
        }
        if(erro){
            break;
        }
        }
        if(erro || !pilha.isEmpty()){
            System.out.println("Expressao errada");
        }else{
            System.out.println("Expressao valida");
        }
        
    }

    public static void EX2(){
    String expressao = "([]{})";
            Stack<Character> pilha = new Stack<Character>();

            int i; 
            char c;
            boolean erro;
            erro=false;

            for(i=0;i<expressao.length();i++){
                c = expressao.charAt(i);
             switch(c){
            //situacao para ()
            case '(':
                pilha.push(c);
            break;
            case ')':
            if(pilha.isEmpty()){
                erro = true;
            }else{
                if(pilha.pop()!='('){
                    erro = true;
                }
            }
            break;
        
            // situacao para {} 
                case '{':
                    pilha.push(c);
                break;
                case '}':
                if(pilha.isEmpty()){
                    erro = true;
                }else{
                    if(pilha.pop()!='{'){
                        erro = true;
                    }
                }
                break;
            
            // situacao para []
                case '[':
                    pilha.push(c);
                break;
                case ']':
                if(pilha.isEmpty()){
                    erro = true;
                }else{
                    if(pilha.pop()!='['){
                        erro = true;
                    }
                }
                break;
            }
            if(erro){
                break;
            }
            }
            if(erro || !pilha.isEmpty()){
                System.out.println("Expressao errada");
            }else{
                System.out.println("Expressao valida");
            }
            
    }
    
    
    public static void main(String[] args) {
        EX2();
    



    }
}