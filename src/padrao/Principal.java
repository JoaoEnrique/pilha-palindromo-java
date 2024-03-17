/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao;

/**
 * 07/03/2024
 * @author João Enrique
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilhaOriginal = new Pilha(5);
        Pilha pilhaAuxiliar = new Pilha(5);
        Pilha pilhaSaida = new Pilha(5);
        
        String palavra = "arara"; //palavra para verificar se é palindromo
        
        //percorre cada caractere para salvar no vetor original e auxiliar
        for (int i=0; i<palavra.length(); i++) { 
            char c = palavra.charAt(i); //pega caractere da pavara
            pilhaOriginal.push(c); //adiciona caractere na pilha original
            pilhaAuxiliar.push(c); //adiciona caractere na pilha auxiliar
        }
        
        //pilha saida recebe pilha auxiliar (ao contrario)
        for(int i=0; i<pilhaAuxiliar.size(); i++){ //percorre pilha auxiliar
            char c = pilhaAuxiliar.pop(); //remove último valor da pilha auxiliar
            pilhaSaida.push(c); //coloca ultimo caractere da pilha auxiliar na pilha de saida
        }
       
        //verifica se pilha original é igual a de saida (é um palindromo)
        if(pilhaOriginal.isPalindromo(pilhaSaida)){
            System.out.println("A palavra é um Palindromo");
        }else{
            System.out.println("A palavra não é um Palindromo");
        }
        
    }
    
}
