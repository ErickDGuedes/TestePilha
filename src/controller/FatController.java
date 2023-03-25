package controller;
import br.edu.fateczl.pilhaint.Pilha;
public class FatController {
	
	public FatController() {
		super();
	}
	
	public int fatorial(int valor) {
		Pilha p = new Pilha();
		int i = 1;
		int v2 = valor;
		while(i < v2) {
			p.push(valor);
			try {
				int v1 = i;
				valor = valor*v1;
				p.push(valor);
				i++;
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		p.push(valor);	
		return valor;
	}

}
