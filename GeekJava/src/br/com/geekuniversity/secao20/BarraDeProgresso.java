package br.com.geekuniversity.secao20;

public class BarraDeProgresso implements Runnable{
	public void executa() {		
		for(int i=0; i< 1000; i++) {
			System.out.println(i+" Barra de Progresso... aguarde");
		}
	}

	@Override
	public void run() {		
		for(int i=0; i< 1000; i++) {
			System.out.println(i+" Barra de Progresso... aguarde");
		}
	}
}
