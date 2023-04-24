package br.edu.ifsp.xyz.comissao;

import br.edu.ifsp.xyz.leitor.Leitor;

import java.util.ArrayList;

public class Produto {
	String nomeProduto;
	double valor;
	CategoriaDoProduto categoria;
	double comissaoVendedor;
	double comissaoRepresentante;
	
	public Produto(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor (caminho, chave, valorChave);
		ArraysList<String> produtos = leitor.conteudo();
		
		String produto = produtos.get(0);
		String[] campos = produto.split(";");
		
		this.nomeProduto = campos[0];
		this.valor = Double.parseDouble(campos[1]);
		this.categoria = new CategoriaDoProduto (nomeProduto);
		
		comissaoVendedor = (categoria.comissaoVendedor / 100) * valor;
		comissaoRepresentante = (categoria.comissaoRepresentante / 100) * valor;
		
	}
	
	public String toString() {
		return " Produto [Nome: " + nomeProduto + ", Valor = " + valor + categoria + "] \n Comissão do Vendedor: " + comissaoVEndedor + ", Comissão do Representante: " + comissaoRepresentante;
	}
}
