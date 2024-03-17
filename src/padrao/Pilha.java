package padrao;
import java.util.Arrays;

/**
 * 07/03/2024
 * @author João Enrique
 */
public class Pilha {
    private int topo;
    private final int tamanho;
    private final char p[];
    
    public Pilha(int tamanho){
        this. p = new char[tamanho];
        this.topo = -1;
        this.tamanho = tamanho;
    }
    
    //Metodo para verificar se pilha está vazia
    public boolean isEmpty(){
        return topo == -1;
    }
    
    //Metodo para verificar se pilha está cheia
    public boolean isFull(){
        return topo == p.length -1;
    }
    
    //metodo que retorna tamanho da pilha
    public int size(){
        return tamanho;
    }
    
    //Metodo para empilhar (adicionar)
    public String push(char c){ 
        if(isFull()){ //erro caso a alista esteja cheia
            throw new IllegalArgumentException("A lista está cheia. Nao foi possivel adicionar palavra");
        }
        
        this.topo++;
        p[topo] = c;
        
        return Arrays.toString(p);
    }
    
    //Metodo para desimpilhar (remover último)
    public char pop(){
        if(isEmpty()){ //erro se a lista estiver vazia
            throw new IllegalStateException("A lista está vazia. Nao foi possivel remover último caractere");
        }
        
        return p[this.topo--];
    }
    
    //Converter para string antes de mostrar
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(p, 0, p.length));
    }

    //verifica se duas pilhas são iguais (se é um palindromo)
    public boolean isPalindromo(Pilha p2){
        for (int i = 0; i <= p2.topo; i++) { //percorre pilha para  verificar cada elemento da pilha
            if (this.p[i] != p2.p[i]) {  //caso caractere seja diferente, retorna false
                return false; 
            }
        }

        return true;
    }
}
