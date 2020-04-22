
public class Canal {
	private  int numero;
	private String nome;
	private boolean HD;
	
	public Canal (int numero, String nome, boolean HD) {
		this.numero = numero;
	    this.nome = nome;
	    this.HD = HD;
	}
	  
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isHD() {
		return HD;
	}
	public void setHD(boolean HD) {
		this.HD = HD;
	}
}
