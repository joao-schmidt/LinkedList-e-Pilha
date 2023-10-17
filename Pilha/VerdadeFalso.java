import java.util.Scanner;
import java.util.Stack;

public class VerdadeFalso{

    public static boolean BuscaBinaria(int[] valores, int x, int i, int fim){
        //9 11 15 19 20 27 29 50 51 57 60
        int ini=0, meio; fim = valores.length-1;
        while(ini<=fim){
            meio= (fim-ini)/2;
            if(valores[meio]==x){
                return true;
            }if(x>valores[meio]){
                ini= meio+1;
            }else{
                fim= meio -1;
            }
        }
        return false;
        }
    public static boolean buscaRecursiva(int[] valores, int x){
        int i;
        for(i=0;i<valores.length;i++){
            if(valores[i]== x){
                return true;
            }
        }
        return false;
    }

    public static boolean buscaBinariaRecInterna(int[] valores, int x, int ini, int fim){
        if(ini>fim) return false;
        int meio = ini+(fim-ini)/2;
        if(valores[meio]== x) return true;
        if(x>valores[meio])return buscaBinariaRecInterna(valores,x,meio+1,fim);
        return BuscaBinaria(valores, x,ini,meio-1);

    }
    public static boolean buscaBinariaRec(int[] valores, int x){
        return buscaBinariaRecInterna(valores, x, x, x);
    }
    


    public static void main(String[] args) {
   
        
    
   
    }
}