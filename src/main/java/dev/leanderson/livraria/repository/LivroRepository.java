package dev.leanderson.livraria.repository;

import java.util.List;
import java.util.ArrayList;
import dev.leanderson.livraria.model.Livro;

// TODO: Auto-generated Javadoc
/**
 * The Class LivroRepository.
 */
public class LivroRepository {
	
	/** The Constant LISTA_LIVROS. */
	// 1. Colecao (List) para simular o banco de dados na memoria
	private static final List<Livro> LISTA_LIVROS = new ArrayList<>();
	
	/** The id sequence. */
	// 2. Contador/Gerador de ID's
	private static Long ID_SEQUENCE = 1L;
	
	/**
	 * Instantiates a new livro repository.
	 */
	// Construtor privado para evitar que a classe seja instanciada fora
	private LivroRepository() {
	}
	
	// Metodos do CRUD
	
	/**
	 * Retorna todos os livros. (READ - Listar)
	* @return List<Livro>
	*/
	public static List<Livro> listarTodos() {
		return LISTA_LIVROS;
	}

	/**
	* Adiciona um novo livro, atribuindo-lhe um ID sequencial. (CREATE - Adicionar)
	* @param livro O objeto Livro a ser adicionado.
	* @return O Livro com o ID ja enriquecido com o ID.
	*/
	public static Livro adicionar(Livro livro) {
		// 1. Atribui o ID atual da sequencia ao objeto
	    livro.setId(ID_SEQUENCE);
	    
	    // 2. Adiciona o objeto Livro a lista
	    LISTA_LIVROS.add(livro);
	    
	    // 3. Incrementa a sequencia para o proximo livro
	    ID_SEQUENCE++;
	    
	    return livro;
	}
	
	/**
	 * Busca um livro pelo seu ID. (READ - por ID)
	 * @param id O ID do livro a ser procurado.
	 * @return O Livro encontrado ou null.
	 */
	public static Livro buscarPorId(Long id) {
	    for (Livro livro : LISTA_LIVROS) {
	        if (livro.getId().equals(id)) {
	            return livro;
	        }
	    }
	    return null;
	}

	/**
	 * Remove um livro pelo ID. (DELETE)
	 * @param id O ID do livro a ser removido.
	 * @return true se o livro foi removido, false caso contrario.
	 */
	public static boolean remover(Long id) {
	    // Busca o livro para remover
	    Livro livroParaRemover = buscarPorId(id);
	    
	    if (livroParaRemover != null) {
	        // Se encontrou, usa o metodo 'remove' da List para remover o objeto.
	        LISTA_LIVROS.remove(livroParaRemover);
	        return true;
	    }
	    return false;
	}

}
