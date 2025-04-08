package controller;
import br.edu.fateczl.fila.*;
import model.Cliente;

public class OperacaoController {
	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila<Cliente> fila) throws Exception {
		for(int i = 0 ; i < 20 ; i++) {
			Cliente c = fila.remove();
			String n = c.getNome();
			int qP = c.getQuantPecas();
			Float vP = c.getValorPecas();
			
			Float total = qP * vP;
			System.out.println(n + " - Total da compra: R$" + total);
		}
	}
}
