
public class Video {
	
	private String nome;
	private Categoria categ;
	
	
	
	public Video(String nome, Categoria categ) {
	
		this.nome = nome;
		this.categ = categ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCateg() {
		return categ;
	}
	public void setCateg(Categoria categ) {
		this.categ = categ;
	}
	
	

}
