package model;

public class Cliente {
		String nome;
		int quantPecas;
		Float valorPecas;
	
	public Cliente(String n, int qP, Float vP) {
		nome = n;
		quantPecas = qP;
		valorPecas = vP;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantPecas() {
		return quantPecas;
	}

	public void setQuantPecas(int quantPecas) {
		this.quantPecas = quantPecas;
	}

	public Float getValorPecas() {
		return valorPecas;
	}

	public void setValorPecas(Float valorPecas) {
		this.valorPecas = valorPecas;
	}
	
}


