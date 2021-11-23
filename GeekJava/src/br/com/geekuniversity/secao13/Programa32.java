package br.com.geekuniversity.secao13;

public class Programa32 {
	
	//Template Method

	public static void main(String[] args) {
		
		
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.treinoDiario();
		
	}

}
