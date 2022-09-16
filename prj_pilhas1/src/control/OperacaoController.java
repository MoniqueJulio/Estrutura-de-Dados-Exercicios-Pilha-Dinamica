package control;

import br.com.leandrocolevati.pilhaint.Pilha;

public class OperacaoController {

	Pilha p = new Pilha();

	int dados;

	public OperacaoController() {
	}

	public int MaiorVAlor(Pilha pilha) throws Exception {
		int result = 0;
		while (pilha.size() > 1) {
			int compara1 = pilha.pop();
			int compara2 = pilha.pop();
			if (compara1 > compara2) {
				result = compara1;
			} else {
				result = compara2;
			}
			pilha.push(result);
		}
		return pilha.top();
	}
}
