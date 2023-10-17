import java.util.Stack;
public class Posfixa {

    public static void main(String[] args) {
    
    Stack<Integer> pilha = new Stack<Integer>();
    int i, op1, op2, res;
    String valor ="50";
    String expressao = "5 3 + 2 4 * + 6 7 * 1 - +";
    String[] tokens = expressao.split(" ");
    
    for(i=0;i<tokens.length;i++){
        System.out.println(tokens[i]);
        switch(tokens[i]){
            case "+":
                if(pilha.empty()){System.out.println("expressao invalida"); System.exit(1);}
                op2=pilha.pop();
                if(pilha.empty()){System.out.println("expressao invalida");System.exit(1);}
                op1=pilha.pop();
                pilha.push(op1+op2);
                break;
            case "-":
                if(pilha.empty()){System.out.println("expressao invalida"); System.exit(1);}
                op2=pilha.pop();
                if(pilha.empty()){System.out.println("expressao invalida"); System.exit(1);}
                op1=pilha.pop();
                pilha.push(op1-op2);
                break;
            case "*":
                if(pilha.empty()){System.out.println("expressao invalida"); System.exit(1);}
                op2=pilha.pop();
                if(pilha.empty()){System.out.println("expressao invalida"); System.exit(1);}
                op1=pilha.pop();
                pilha.push(op1*op2);
                break;
            case "/":
                System.out.println("dividir");
                break;
            default:
                System.out.println("operando");
                pilha.push(Integer.parseInt(tokens[i]));//converte o valor para inteiro Integer.parseInt(...);
        }    
    }
    if(pilha.empty()){System.out.println("expressao invalida"); System.exit(1);}
    res = pilha.pop();
    
    if(!pilha.empty()){
       System.out.println("espressao invalida");
       System.exit(1);
    }else{
       System.out.println(res);
    }

   
    //System.out.println(Integer.parseInt(valor)+20);



    }
    
}
