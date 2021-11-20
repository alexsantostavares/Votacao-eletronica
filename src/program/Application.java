package program;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Urna urna1 = new Urna();
		Urna urna2 = new Urna();
		
		urna1.setCandidato("Rodrigo Petrucci");
		urna2.setCandidato("Mirela Santos");
		
		int aux = 0;
		
		while(aux != 3) {
			System.out.println("\nDigite 1 para votar em branco"
					        +  "\nDigite 2 para escolher o candidato"
					        +  "\nDigite 3 para encerrar votação e apurar os votos");
			
			aux = sc.nextInt();
			
			if(aux == 1) {
				urna1.adicionar_nulo();
				System.out.println("Voto nulo com sucesso!");
			}
			else if(aux == 2) {
				System.out.println("\nPara candidato Rodrigo Petrucci vote *55*");
				System.out.println("Para candidata Mirela Santos vote *65*");
				System.out.print("Insira Voto: ");
				int aux2 = sc.nextInt();
				
				if(aux2 == 55) {
					System.out.println("\nVoto efetuado!");
					urna1.adicionar_voto();
				}
				else{
					System.out.println("\nVoto efetuado!");
					urna2.adicionar_voto();
				}
		    }
			else {
				
				urna1.resultado_nulo();
				urna1.resultado();
				urna2.resultado();
				
				if(urna1.getVoto()>urna2.getVoto()) {
					System.out.println(urna1.getCandidato()+" Venceu a votação!");
				}
				else if(urna2.getVoto()>urna1.getVoto()) {
					System.out.println(urna2.getCandidato()+" Venceu a votação!");
				}
				else {
					System.out.println("Empate tecnico!!");
				}
			}
		
		}
		sc.close();
	}

}
