package dev.leanderson.livraria.service;

import java.util.List;

import dev.leanderson.livraria.model.Livro;
import dev.leanderson.livraria.repository.LivroRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class LivroService.
 */
public class LivroService {

	/**
	 * Cadastrar.
	 *
	 * @param livro the livro
	 * @return the livro
	 */
	// 1. Cria um novo livro ( CREATE )
	public Livro cadastrar(Livro livro) {
		// Regras de Negocio para cadastro: ...
		// .....
		// Mensagem retorno
		System.out.println("SERVICE: Solicitando o cadastro do livro: "+livro.getTitulo());
		return LivroRepository.adicionar(livro);
	}

	/**
	 * Buscar todos.
	 *
	 * @return the list
	 */
	// 2. Listar todos os livros ( READ )
	public List<Livro> buscarTodos() {
		System.out.println("SERVICE: Solicitando todos os livros.");
		return LivroRepository.listarTodos();
	}

	/**
	 * Atualizar.
	 *
	 * @param livroAtualizado the livro atualizado
	 * @return the livro
	 */
	// 3. Modificar um livro existente ( UPDATE )
	public Livro atualizar(Livro livroAtualizado) {
		// Regra de Negócio: Verificar se o livro com o ID existe antes de atualizar.
        Long id = livroAtualizado.getId();
        
        // Busca o livro no Repository. -- Essa regra aqui serve em outros metodos tbm --
        Livro livroExistente = LivroRepository.buscarPorId(id); 

        if (livroExistente == null) {
            System.out.println("SERVICE: Erro! Livro com ID " + id + " não encontrado.");
            return null; // Retorna null se nao achar
        }

        // Se encontrou, faz as alterações (aqui pode usar um metodo atualizar no Repository)
        // Aqui, faz a atualização na memória. Usa o 'set' no objeto encontrado.
        livroExistente.setTitulo(livroAtualizado.getTitulo());
        livroExistente.setAutor(livroAtualizado.getAutor());
        livroExistente.setAno(livroAtualizado.getAno());
        livroExistente.setGenero(livroAtualizado.getGenero());

        System.out.println("SERVICE: Livro com ID " + id + " atualizado com sucesso.");
        return livroExistente;
	}
	
	/**
	 * Remover.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	// 4. Remover um livro (DELETE)
    public boolean remover(Long id) {
        // Regra de Negocio: A deleta se o livro existir.
        
        // O metodo 'remover' do Repository retorna true/false.
        boolean removido = LivroRepository.remover(id); 

        if (removido) {
            System.out.println("SERVICE: Livro com ID " + id + " removido.");
        } else {
            System.out.println("SERVICE: Erro! Livro com ID " + id + " não encontrado para remoção.");
        }
        return removido;
    }

}

