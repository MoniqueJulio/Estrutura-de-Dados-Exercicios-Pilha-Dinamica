package view;

import br.com.leandrocolevati.pilhaint.Pilha;
import control.OperacaoController;

public class Principal {
	public static void main(String[] args) throws Exception {

		Pilha pilha = new Pilha();

		for (int i = 0; i < 15; i++) {
			int random = (int) ((Math.random() * 51) + 1);
			pilha.push(random);
		}

		OperacaoController op = new OperacaoController();
		int mostra = op.MaiorVAlor(pilha);
		System.out.println(mostra);
	}

}
