package br.edu.insper.desagil.joice.view;

import br.edu.insper.desagil.joice.model.Calculadora;
import br.edu.insper.desagil.joice.model.CalculadoraCCC;
import br.edu.insper.desagil.joice.model.CalculadoraCFC;

public abstract class CalculadoraView {
	private Calculadora calculadora;
	private String nomeImagem;

	public CalculadoraView(Calculadora calculadora, String nomeImagem) {
		this.calculadora = calculadora;
		this.nomeImagem = nomeImagem;
	}

	public CalculadoraView(CalculadoraCFC calculadoraCFC, String nomeImagem2) {
		this.calculadoraCFC = calculadoraCFC;
		this.nomeImagem = nomeImagem2;
	}

	public CalculadoraView(CalculadoraCCC calculadoraCCC, String nomeImagem3) {
		// TODO Auto-generated constructor stub
	}

	public Calculadora getCalculadora() {
		return this.calculadora;
	}

	public String getNomeImagem() {
		return this.nomeImagem;
	}

	public String toString() {
		return this.calculadora.getNome();
	}
}
