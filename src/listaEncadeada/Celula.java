package listaEncadeada;

public class Celula {
	private Professor professor;
	private Celula proximo;
	
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Celula getProximo() {
		return proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public boolean temProximo() {
		return this.proximo != null; 
	}
	
	
}
