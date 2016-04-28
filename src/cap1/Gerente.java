package cap1;

public class Gerente extends Empregado {
	private float bonus;

	public float salarioMensal() {
		return salario + bonus;
	}

	public float salarioMensal(float desconto) {
		return salario + bonus - desconto;
	}

	public void imprime() {
		System.out.println("Gerente");
	}
}
