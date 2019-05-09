
public class Video {
	
	private String nome;
	private String duracao;
	private Categoria categ;
	
	
	
	public Video(String nome, Categoria categ, String duracao) {
	
		this.nome = nome;
		this.categ = categ;
		this.duracao = duracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public Categoria getCateg() {
		return categ;
	}
	public void setCateg(Categoria categ) {
		this.categ = categ;
	}
	
	

}
