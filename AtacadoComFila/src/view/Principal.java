package view;

import java.util.Random;

import br.edu.fateczl.fila.*;
import model.Cliente;
import controller.OperacaoController;

public class Principal { 
	public static void main(String[] args) throws Exception{
		Random r = new Random();
		Fila<Cliente> fila = new Fila<>();
		for(int i = 0; i < 20 ; i++) {
			String n = "Cliente" + (i+1);
			int qP = 20 + r.nextInt(31);
			Float vP = 5.00f + r.nextFloat() * 95.00f;
			
			Cliente c = new Cliente(n, qP, vP);
			fila.insert(c);
		}
		
		OperacaoController c = new OperacaoController();
		c.caixa(fila);
	}
}
