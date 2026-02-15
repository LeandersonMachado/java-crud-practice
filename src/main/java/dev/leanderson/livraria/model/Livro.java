package dev.leanderson.livraria.model;

// TODO: Auto-generated Javadoc
/**
 * The Class Livro.
 */
public class Livro {

	/** The id. */
	// Atributos
	private long id;
	
	/** The titulo. */
	private String titulo;
	
	/** The autor. */
	private String autor;
	
	/** The ano. */
	private int ano;
	
	/** The genero. */
	private String genero;
	
	/**
	 * Instantiates a new livro.
	 */
	// Constructor vazio
	public Livro() {
		
	}
	
	/**
	 * Instantiates a new livro.
	 *
	 * @param titulo the titulo
	 * @param autor the autor
	 * @param ano the ano
	 * @param genero the genero
	 */
	// Constructor sem ID
	public Livro(String titulo, String autor, int ano, String genero) {
		this.autor = autor;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
	}

	/**
	 * Instantiates a new livro.
	 *
	 * @param id the id
	 * @param titulo the titulo
	 * @param autor the autor
	 * @param ano the ano
	 * @param genero the genero
	 */
	// Constructor completo
	public Livro(Long id, String titulo,String autor, int ano,  String genero) {
		this.id = id;
		this.autor = autor;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	// Getters e Setters
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the autor.
	 *
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Sets the autor.
	 *
	 * @param autor the new autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Gets the ano.
	 *
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Sets the ano.
	 *
	 * @param ano the new ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Gets the genero.
	 *
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Sets the genero.
	 *
	 * @param genero the new genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Livro [id=" + id + ", autor=" + autor + ", titulo=" + titulo + ", ano=" + ano + ", genero=" + genero
				+ "]";
	}
	
}

