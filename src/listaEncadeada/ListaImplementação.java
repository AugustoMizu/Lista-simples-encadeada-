package listaEncadeada;

public class ListaImplementação {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		inserirProfessor(lista, 1, "nome 1");
		inserirProfessor(lista, 2, "nome 2");
		inserirProfessor(lista, 3, "nome 3");
		inserirProfessor(lista, 4, "nome 4");
		inserirProfessor(lista, 5, "nome 5");
		
		System.out.println("Professores inseridos \n__________________________");
		lista.listar();
		System.out.println("\nUltimo Professor excluido\n__________________________");
		lista.excluir();
		lista.listar();
		
	}

	public static void inserirProfessor(ListaEncadeada lista, Integer id, String nome) {

		Professor professor = new Professor(id, nome);
	
		lista.inserir(professor);
	}
}