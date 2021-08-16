
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.saldo);
		
		boolean conseguiuRetirar = contaPaulo.saca(20);
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaPaulo)) {
			System.out.println("tranferencia co sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.titular = "paulo silveira";
		System.out.println(contaPaulo.titular);
	}

}
