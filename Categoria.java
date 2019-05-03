
public class Categoria {

	private String nome;

	
	
	
	public Categoria(String nome) {

		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean camparar(Categoria categoria) {
		if(nome.equals(categoria.nome)) {
			return true;
		}else {
			return false;
		}
			
	}
	
}
