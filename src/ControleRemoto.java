import java.util.ArrayList;

public class ControleRemoto {
	private ArrayList<Televisao> listaTVs = new ArrayList<>();
	
	public ControleRemoto(ArrayList<Televisao> listaTVs) {
		this.listaTVs = listaTVs;
	}
	
	public void adicionarTV(Televisao televisao ) {
		try {
			if(listaTVs.contains(televisao)) {
				throw new ErroTvJaCadastrada();
			}else {
				listaTVs.add(televisao);
			}
		}catch(ErroTvJaCadastrada e) {
			e.printStackTrace();
		}
	}
	
	public void alterarVolume(int alteracao) {
		for(int i= 0 ;i <listaTVs.size();i++) {		
				listaTVs.get(i).alterarVolume(alteracao);
		}		
	}
	
	
	public void sintonizarCanal(int canal) {
		for(int i= 0 ;i <listaTVs.size();i++) {
				listaTVs.get(i).sintonizar(canal);	
		}
	}
	
	public void alterarCanal(String escolha) {
		for(int i= 0 ;i <listaTVs.size();i++) {
				listaTVs.get(i).alterarCanal(escolha);
		}
	}
	
	public void informarDados() {
		for(int i= 0 ;i <listaTVs.size();i++) {
				listaTVs.get(i).informarDados();		
	  }
	}
	
	public void mostrarGrade() {
		for(int i= 0 ;i <listaTVs.size();i++) {
			listaTVs.get(i).mostrarGrade();		
  }
	}
	

}
