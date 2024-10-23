package dia0910;

public class contaBancaria {
	private double saldo;

	public contaBancaria(double saldoInicial) {
		
		if (saldoInicial >=0) {
			this.saldo = saldoInicial;

		} else {
			this.saldo = 0;
		}
	}
	public double getsaldo() {
		return saldo;
	}
	public void depositar (double valor) {
		if (valor > 0);
		saldo += valor;
	} else {
		System.out.println("valor do deposito invalido");
	}

	

    public void sacar (double valor) {
	    if (valor > 0 && valor <= saldo) {
	    	saldo -= valor;
	    } else {
	    	System.out.println("saque invalido!");
	    
	    	
	    }
    }
	    
	    }




