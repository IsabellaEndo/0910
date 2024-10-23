package dia0910;

public class construtorcasa {

	public static void main(String[] args) {
		casa casal = new casa ("Casa do Bytemaster", 10, 20, "Telhado triângular,", 2) ;

		System.out.println (casal.getNome ()) ;
		System.out.println (casal.getAltura ()) ;
		System.out.println (casal.getLargura()) ;
		System.out.println (casal.getTelhado()) ;
		System.out.println (casal. getNumeroJanelas()) ;
	}

}


