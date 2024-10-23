package dia0910;

public class tema {
	public long id;
	public String nome;
	public double valorAluguel;
	public String corToalha;
    
    public tema (String nome, long id, double valorAluguel, String corToalha) {
		
		this.nome = nome;
		this.id = id;
		this. valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getCorToalha() {
        return corToalha;
    }

    public void setCorToalha(String corToalha) {
        this.corToalha = corToalha;
    }
    public void setValorAluguel1(double valorAluguel) {
    	if(ValorAluguel >= 450) {
    	this.ValorAluguel = valorAluguel;
    	}else {
    	System.out.println("o valor inserido é irregular");
    	}
    }
}


