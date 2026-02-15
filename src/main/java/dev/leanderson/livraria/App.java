// src/main/java/com/seu/nome/livraria/App.java

package dev.leanderson.livraria;

import dev.leanderson.livraria.model.Livro;
import dev.leanderson.livraria.service.LivroService;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Teste: Fluxo Completo do CRUD (Controller -> Service -> Repository) ---\n");

        // 1. Instanciando o Service
        LivroService service = new LivroService();

        // --- 1. CREATE: Cadastrar livros ---
        System.out.println("------ 1. CADASTRO DE LIVROS (CREATE) ------");
        
        Livro livro1 = service.cadastrar(new Livro("Código Limpo", "Robert C. Martin", 2008, "Programação"));
        Livro livro2 = service.cadastrar(new Livro("Dom Casmurro", "Machado de Assis", 1899, "Romance"));
        System.out.println("Total de Livros após cadastro: " + service.buscarTodos().size());

        // --- 2. READ: Listar todos os livros ---
        System.out.println("\n------ 2. LISTAGEM COMPLETA (READ) ------");
        listarLivros(service.buscarTodos());
        
        // --- 3. UPDATE: Modificar Livro 1 ---
        System.out.println("\n------ 3. ATUALIZAÇÃO (UPDATE) ------");
        
        // Cria um objeto com as novas informacoes, porem mantendo o ID original do objeto
        Livro livroAtualizado = new Livro(
            livro1.getId(), 
            "Clean Code (Atualizado)", 
            "Robert C. Martin", 
            2008, 
            "Programação"
        );
        service.atualizar(livroAtualizado);
        
        System.out.println("\nLivro 1 após atualização:");
        // Busca individualmente o livro1 para ver a mudanca feita na atualizacao
        System.out.println(service.buscarTodos().stream()
                               .filter(l -> l.getId().equals(livro1.getId()))
                               .findFirst()
                               .orElse(null));

        // --- 4. DELETE: Remover Livro 2 ---
        System.out.println("\n------ 4. REMOÇÃO (DELETE) ------");
        service.remover(livro2.getId());
        
        // TESTE: Tenta remover um ID que nao existe (Teste de Regra de Negocio)
        service.remover(99L);

        // --- 5. READ: Listar final (apos remocao do livro 2) ---
        System.out.println("\n------ 5. LISTAGEM FINAL ------");
        listarLivros(service.buscarTodos());
        System.out.println("Total de Livros final: " + service.buscarTodos().size());
    }

    /**
     * Listar livros.
     *
     * @param livros the livros
     */
    // Metodo para imprimir a lista
    private static void listarLivros(List<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        }
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}



