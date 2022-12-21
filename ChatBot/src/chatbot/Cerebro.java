package chatbot;

import java.util.Random;

//Classe respons�vel pela regra de neg�cio 
public class Cerebro {
	
	private String[] respostasPadrao = {"Desculpe, n�o entendi.", "Por favor, repita novamente!", "Oi? Poderia repetir?"};
	private String[] despedidasPadrao = {"Espero ter ajudado. Volte sempre!", "Obrigado pelo bate-papo. Nos vemos em breve!", "Espero que tenha gostado do nosso servi�o. At� mais!", "O ChatBot agradece. Volte sempre!"};
	private Random random = new Random();
	
	public String respostaPara(String pergunta) {
				
		switch(pergunta.toLowerCase()) {
		case "que" : pergunta = "O que for mais adequado.";
		break;
		case "porque" : pergunta ="Porque essa � a melhor solu��o.";
		break;
		case "onde" : pergunta = "Pode ser em qualquer lugar.";
		break;
		case "quando" : pergunta = "Em algum dia da semana que vem!";
		break;
		case "como" : pergunta = "Com muito esfor�o e dedica��o!";
		break;
		case "sair" : pergunta = despedidasPadrao[random.nextInt(4)];
		break;
		default : pergunta = respostasPadrao[random.nextInt(3)];
		
		}
		
		return pergunta;
					
	}
		
}
