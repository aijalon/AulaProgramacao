package chatbot;

import java.util.Scanner;

//Responsável por iniciar o programa
public class Inicio {
	
	public static void main(String[] args) {
		
		Cerebro cerebro = new Cerebro();
		String pergunta = "";
		String[] primeiraPalavra = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá, eu sou o Chatbot Mirela! Em que posso ajudar?");
		
		while(!(pergunta.compareToIgnoreCase("Sair")==0)) {
			pergunta = scanner.nextLine();
			
			if(pergunta.compareToIgnoreCase("Onde estão os biscoitos?")==0) {
				System.out.println("No pote de biscoitos!");
			}else if(pergunta.compareToIgnoreCase("Qual o espírito do Natal?")==0) {
				System.out.println("Amor, Fraternidade e Presentes!");
			}else if(pergunta.compareToIgnoreCase("Quais as férias perfeitas?")==0) {
				System.out.println("Aquelas que você me convida!");
			}else {
				primeiraPalavra = pergunta.split(" ");
				pergunta = primeiraPalavra[0];
				
				System.out.println(cerebro.respostaPara(pergunta));				
			}			
		}	

		scanner.close();		
	}

}

/*A estrutura do projeto ficou dividida em duas classes. A classe Cerebro que contem as regras de negócio e a classe Inicio que ficou com a responsabilidade
de chamar a classe Cerebro. 
 

Exercicio 1 - Utilizamos o metodo  'compareToIgnoreCase' para verificar a palavra sair independente da escrita. E utilizamos como estrutura de repetição o While

Exercicio 2 - utilizamos o metodo split para dividirmos o que foi digitado e pegar apenas a primeira palavra.

Exercicio 3 - Utilizamos o metodo toLowerCase para transformar o que foi digitado pelo usuario em minusculo e fazermos a comparação

Exercicio 4 - Usamos o if pra resolvermos a possibilidade das frases mágicas.

Exercicio 5 - Usamos a Classe Random para auxiliar na aleatoriedade das frases.


*/