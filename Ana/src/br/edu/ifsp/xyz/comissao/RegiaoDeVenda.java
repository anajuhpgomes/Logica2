import br.edu.ifsp.xyz.leitor.Leitor;

import java.util.ArrayList;

public class RegiaoDeVenda {
	String nomeRegiao;
	long idRegiao;

	public  RegiaoDeVenda(String caminho, int chave, String valorChave) throws Exception{
		Leitor leitor = new Leitor (caminho, chave, valorChave);
		
		ArrayList<String> regioesDeVenda = leitor.conteudo();
		String regiaoDeVenda = regioesDeVenda.get(0);
		
		String [] campos = regiaoDeVenda.split(";");
		
		this.nomeRegiao = campos [0];
		this.idRegiao = Long.parseLong(campos[1]);
		
	}
	
	 public String toString() {
	        return ", Região: [" + nomeRegiao + ", ID: " + idRegiao + "]";
	    }
}
