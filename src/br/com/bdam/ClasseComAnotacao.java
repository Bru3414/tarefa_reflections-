package br.com.bdam;

@TabelaAnotacao(nome = "Teste")
public class ClasseComAnotacao {
	
	public static void main(String args[]) {
		Class<TabelaAnotacao> tab = TabelaAnotacao.class;
		System.out.println(tab.getName());
	}
}
