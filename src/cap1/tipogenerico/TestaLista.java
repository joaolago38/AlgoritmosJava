package cap1.tipogenerico;

import java.util.Random;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<Integer> lista = new Lista<Integer>();
		Integer vetor[] = new Integer[1000];
		Integer n = null;
		int i, j, k, max;
		Random randon = new Random();
		max = 10;
		try {
			for (i = 0; i < max; i++) {
				vetor[i] = new Integer(i);
			}
			for (i = 0; i < max; i++) {
				k = Math.abs(randon.nextInt()) % max;
				j = Math.abs(randon.nextInt()) % max;
				n = vetor[k];
				vetor[k] = vetor[j];
				vetor[j] = n;
			}
			for (i = 0; i < max; i++) {
				lista.insere(vetor[i]);
				System.out.println("Inseriu : " + vetor[i].toString());
			}
			lista.imprime();
			for (i = 0; i < max; i++) {
				n = lista.pesquisa(vetor[i]);
				System.out.println("Item : " + n.toString());
			}
			Integer item = lista.pesquisa(vetor[i]);
			if (item == null) {
				System.out.println("Item nao encontrado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
