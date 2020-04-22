import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		Canal record = new Canal(8, "Record", true);
		Canal globo = new Canal(10, "Globo", true);
		Canal sbt = new Canal(12, "SBT", true);
		Canal uniao = new Canal(17, "TVuniao", false);
		
		ArrayList<Canal> canais = new ArrayList<>();
		
		 	canais.add(globo);
	        canais.add(record);
	        canais.add(sbt);
	        canais.add(uniao);
	        
	     Televisao smart1 = new SmartTV(32, canais, "LG340");  
	     Televisao tv2 = new TVHD("plasma", canais, "sony" );
	     
	     smart1.cadastrarCanais();
	     tv2.cadastrarCanais();
	     
	     ArrayList<Televisao> listaTVs = new ArrayList<>();
	     listaTVs.add(smart1);
	     listaTVs.add(tv2);
	     
	     ControleRemoto cr = new ControleRemoto(listaTVs);
	     
	     int i = 0;
	     
	     do {
	    	 System.out.println("1- Sintonizar em um canal");
	    	 System.out.println("2- Aumentar volume");
	         System.out.println("3- Diminuir volume");
	         System.out.println("4- Próximo canal");
	         System.out.println("5- Anterior canal ");
	         System.out.println("6- Informar dados");
	         System.out.println("7- Mostrar grade");
	         System.out.println("8- Sair");
	         System.out.println("TVs criadas:");
	         
	         for(int i2 = 0; i2 < listaTVs.size(); i2++) {
	        	 System.out.println(listaTVs.get(i).id);
	        	 
	         }
	         
	         int opcao = sc.nextInt();
	         	         
	         switch(opcao) {
	         case 1:
	        	 System.out.println("digite o numero do canal: ");
	        	 int numeroCanal = sc.nextInt();
	        	cr.sintonizarCanal(numeroCanal);
	        	 break;
	        	 
	         case 2:
	        	 cr.alterarVolume(1);
	        	 break;
	         case 3:
	        	 cr.alterarVolume(-1);
	        	 break;
	         
	     	 case 4:
	     		 cr.alterarCanal("proximo");
        	     break;
	     	case 5:
	     		 cr.alterarCanal("anterior");
	             break;
	     	case 6: 
	     		cr.informarDados();
	     		break;
	     	case 7: 
	     		cr.mostrarGrade();
	     		break;
	         case 8:
	        	 i = 8;
	        	 break;
	         }
	     } while(i!= 8);
	}
}

