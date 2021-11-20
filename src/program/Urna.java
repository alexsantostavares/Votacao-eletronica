package program;

public class Urna {
	
	private int nulo;
	private int voto;
	private String candidato;
	
	
	
	public void setNulo(int nulo) {
		this.nulo = nulo;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
		
		public void adicionar_nulo() {
			nulo = nulo + 1;
		}
		public void adicionar_voto() {
			voto = voto + 1;				
		}
		
		public void resultado_nulo() {
			System.out.print("------------------------------------------------------------");
			System.out.println("\nVotos nulos: "+ this.nulo);
			System.out.print("------------------------------------------------------------");
		}
		
		public void resultado() {
			System.out.println("\nNumero de votos do(a) candidato(a) " + this.candidato +": " + this.voto);
			System.out.print("------------------------------------------------------------\n");
		}
		
		public int getNulo() {
			return this.nulo;
		}
		
		
		
		
	

}
