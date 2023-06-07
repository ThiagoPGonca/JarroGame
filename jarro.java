import java.lang.Math;
public class jarro {
 
   private int capacidade;
   private int quantidade;

    
    public jarro(int capacidade, int quantidade) {
        this.capacidade = capacidade;
        this.quantidade = quantidade;
    }

    public void fill(){
        if (quantidade < capacidade){
            quantidade = capacidade;
        }else{
        System.out.println("Jarro cheio!");
        }
    }

    public void empty(){
        if (quantidade > 0){
            quantidade = 0;
        }else {
            System.out.println("Jarro vazio!");
        }
        
    }
  
    public void transfer(jarro j){        
        while(!isEmpty()&&!j.isFull()){
            this.quantidade = quantidade -1;
            j.quantidade = j.quantidade +1;
        }
    }

   public boolean isEmpty(){
    return(quantidade == 0);
   }

   public boolean isFull(){
    return(quantidade == capacidade);
   }

    public void getjarro (){
        System.out.println(quantidade);
    }

}