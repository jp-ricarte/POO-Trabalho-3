import java.util.ArrayList;

public class TVHD extends Televisao {
	private String modelo;
	
	public TVHD(String modelo, ArrayList<Canal> canaisDisponiveis, String id) {
		super(canaisDisponiveis, id);
		this.modelo = modelo;
	}
	
	public void cadastrarCanais() {
		for(int i = 0; i< canaisDisponiveis.size(); i++) {
			if(canaisDisponiveis.get(i).isHD() == true) {
				canaisCadastrados.add(canaisDisponiveis.get(i));
			}
			canalAtual = canaisCadastrados.get(canaisCadastrados.size());
		}
	}
}
