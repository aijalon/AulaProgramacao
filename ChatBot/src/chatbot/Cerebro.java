package chatbot;

import java.util.Random;

//Classe responsável pela regra de negócio 
public class Cerebro {
	
	private String[] respostasPadrao = {"Desculpe, não entendi.", "Por favor, repita novamente!", "Oi? Poderia repetir?"};
	private String[] despedidasPadrao = {"Espero ter ajudado. Volte sempre!", "Obrigado pelo bate-papo. Nos vemos em breve!", "Espero que tenha gostado do nosso serviço. Até mais!", "O ChatBot agradece. Volte sempre!"};
	private Random random = new Random();
	
	public String respostaPara(String pergunta) {
				
		switch(pergunta.toLowerCase()) {
		case "que" : pergunta = "O que for mais adequado.";
		break;
		case "porque" : pergunta ="Porque essa é a melhor solução.";
		break;
		case "onde" : pergunta = "Pode ser em qualquer lugar.";
		break;
		case "quando" : pergunta = "Em algum dia da semana que vem!";
		break;
		case "como" : pergunta = "Com muito esforço e dedicação!";
		break;
		case "sair" : pergunta = despedidasPadrao[random.nextInt(4)];
		break;
		default : pergunta = respostasPadrao[random.nextInt(3)];
		
		}
		
		return pergunta;
					
	}
		
}
