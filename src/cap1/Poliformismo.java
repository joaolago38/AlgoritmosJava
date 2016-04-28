package cap1;

public class Poliformismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado empregado = new Empregado();
		Empregado secretaria = new Secretaria();
		Empregado gerente =  new Gerente();
		empregado.imprime();
		secretaria.imprime();
		gerente.imprime();

	}

}
