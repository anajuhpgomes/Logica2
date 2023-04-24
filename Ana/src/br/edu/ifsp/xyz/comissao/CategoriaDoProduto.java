package br.edu.ifsp.xyz.comissao;

import br.edu.ifsp.xyz.leitor.Leitor;

import java.util.ArrayList;

public class CategoriaDoProduto {
	String nomeCategoria;
	double comissaoVendedor;
	double comissãoRepresentante;
	
	public CategoriaDoProduto(String nomeProduto) throws Exception {
		Leitor leitor = new Leitor ("src/CategoriasDeProduto", 0, nomeProduto);
		ArrayList<String> categorias = leitor.conteudo();
		
		String categoria = categorias.get(0);
		String[] campos = categoria.split(";");
		
		
		this.nomeCategoria = campos [1];
		this.comissaoVendedor = Double.parseDouble(campos[2]);
		this.comissãoRepresentante = Double.parseDouble(campos[3]);
		
	}
	
	
	public String toString() {
		return "Categoria do Produto: " + nomeCategoria;
	}
}
