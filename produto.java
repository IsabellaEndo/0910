package dia0910;

public class produto {
	private String nome;
	private double preco;

	public produto(String nome ,double preco) {
		this.nome = nome;
		setpreco(preco);
	}
	public String getnome () {
		return nome;
	}
	public void setnome (String nome) {
		this.nome = nome;
	}
	public double getpreco () {
		return preco;
	}
	public void setpreco (double preco) {
		if (preco >= 0) {
			this.preco = preco;
		}else {
			System.out.println("preco invalido!");
		}
		public void 
	}
	}
		
		