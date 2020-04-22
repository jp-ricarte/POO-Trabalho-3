import java.util.ArrayList;

public class SmartTV extends Televisao{
	private int polegadas;
	
	public SmartTV(int polegadas, ArrayList<Canal> canaisDisponiveis, String id) {
		super (canaisDisponiveis, id);
		this.polegadas = polegadas;
	}
	 
	public void cadastrarCanais() {
		 canaisDisponiveis.addAll(canaisCadastrados);
	     setCanalAtual(canaisCadastrados.get(0));
	}
}
