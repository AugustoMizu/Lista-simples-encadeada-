package listaEncadeada;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	private void setPosicaoAtual(Celula celula) {
		this.posicaoAtual = celula;
	}

	public void inserir(Professor professor) {
		Celula celula = new Celula();

		celula.setProfessor(professor);
		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	public void excluir() {
		if (primeiro.equals(ultimo)) {
			primeiro = ultimo = null;
		} else {
			posicaoAtual = retornaPenultimo(this.primeiro);
			posicaoAtual.setProximo(null);
			ultimo = posicaoAtual;
		}
	}

	private Celula retornaPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return retornaPenultimo(celula.getProximo());
	}

	public Celula proximo(Celula celula) {
		if (!celula.temProximo()) {
			return null;
		}
		return celula.getProximo();
	}

	public void listar() {
		setPosicaoAtual(primeiro);

		retornaTudo(posicaoAtual);
	}

	private void retornaTudo(Celula posicaoAtual) {
		if (posicaoAtual.equals(ultimo)) {
			System.out.println(
					"ID: " + posicaoAtual.getProfessor().getId() + " Nome: " + posicaoAtual.getProfessor().getNome());
			return;
		}
		System.out.println(
				"ID: " + posicaoAtual.getProfessor().getId() + " Nome: " + posicaoAtual.getProfessor().getNome());

		retornaTudo(proximo(posicaoAtual));
	}

}
