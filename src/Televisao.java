import java.util.ArrayList;

public abstract class Televisao {
	protected String id;
	protected int volume;
	protected Canal canalAtual;
	
	protected static final int volumeMax = 10;
	protected static final int volumeMin = 0;
	
	protected ArrayList<Canal> canaisCadastrados = new ArrayList<>();
	protected ArrayList<Canal> canaisDisponiveis = new ArrayList<>();
	
	public Televisao( ArrayList<Canal> canaisCadastrados, String id) {
		this.volume = 5;
		this.canaisCadastrados = canaisCadastrados;
		this.id = id;
	}
	
	public int getVolume(){
		return volume;
	}
	public void setVolume(int volume ) {
		this.volume = volume;
	}
	
	 public Canal getCanalAtual(){
	        return this.canalAtual;
	    }
	    public void setCanalAtual(Canal canalAtual){
	        this.canalAtual = canalAtual;
	    }
	
	public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
	
	
	public void alterarVolume(int alteracao) {
		if(alteracao == 1) {
			this.volume++;
			
			if(volume > volumeMax) {
				System.out.println("Volume máximo!");
			}
		}else if(alteracao == -1) {
			this.volume--;
			
			if(volume < volumeMin) {
				System.out.println("Volume mínimo!");
			}
		}else {
			System.out.println("Aumente com +1 ou diminua com -1, somente!");
		}
	}
	
public abstract void cadastrarCanais();
	
	public boolean existeCanal(Canal tv) {
		boolean existe = false;
		for(int i = 0; i < canaisDisponiveis.size(); i++ ) {
			if(canaisDisponiveis.contains(tv)) {
				System.out.println("existe");
				existe = true;
			} else {
				System.out.println("nao existe");
				existe = false;
			}
		}
		return existe;
	}
	
	public void sintonizar(int canal) {
		
		try {
			boolean numeroExiste = false;
			for (int i = 0; i < canaisDisponiveis.size(); i++) {
				if(canaisDisponiveis.get(i).getNumero() == canal) {
					numeroExiste = true;
					System.out.println("canal sintonizado: " + canal);
					canalAtual = canaisDisponiveis.get(i);
				} else {
					throw new CanalInexistente();
				}
			}
		} catch(CanalInexistente e) {
			e.printStackTrace();					
		}
	}
	
	public void alterarCanal(String escolha) {
		if(escolha == "proximo") {
			for(int i = 0; i < canaisDisponiveis.size(); i++) {
				if(canaisDisponiveis.get(i) == canalAtual) {
					canalAtual = canaisCadastrados.get(i++);
					
				}else if(escolha == "anterior") {
					canalAtual = canaisCadastrados.get(i--);
				}
			}
		}	
	}
	public void informarDados() {
		System.out.println("nome do canal: " + canalAtual.getNome());
		System.out.println("numero do canal: " + canalAtual.getNumero());
		System.out.println("HD: " + canalAtual.isHD());
		System.out.println("volume: " + this.getVolume());
	}
	public void mostrarGrade() {
		for(int i = 0; i < canaisDisponiveis.size(); i++) {
			System.out.println("nome: "+canaisDisponiveis.get(i).getNome());
			System.out.println("numero: "+canaisDisponiveis.get(i).getNumero());
			System.out.println("HD: "+canaisDisponiveis.get(i).isHD());
		}
	}
}
