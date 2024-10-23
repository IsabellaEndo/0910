package dia0910;

public class Estudante {
	// Getter e Setter para nota2 com validacao
	private String nome;
	private double notal;
	private double nota2;

	// Construtor
	public Estudante (String nome, double notal, double nota2) {
	this.nome = nome;
	setNotal (notal);
	setNota2 (nota2);
	}

	// Getter e Setter para nome
	public String getNome () {
	return nome;
	}

	public void setNome (String nome) {
	this. nome = nome;
	}

	// Getter e Setter para notal com validacao
	public double getNotal() {
	return notal;

	}

	public void setNotal (double notal) {
	if (notal >= 0 && nota2 <= 10) {
	this.notal = notal;
	} else {
	System.out.println("Nota 1 invalida! Deve estar entre 0 e 10.");
	public double getNota2() {
	return nota2;
	}
	

	public void setNota2 (double nota2) {
	if (nota2 >= 0 && nota2 <= 10) {
	this.nota2 = nota2;
	} else {
	System. out.println ("Nota 2 invalida! Deve estar entre 0 e 10.");
	}

	}

	// Método para calcular a média
	public double calcularMedia () {
	return (notal + nota2) / 2;
	}

	// Método para exibir as informacões do estudante
	public void exibirInformacoes () {
	System. out.println ("Estudante: " + nome + ", Média: " + calcularMedia ());

	}
}
	

	