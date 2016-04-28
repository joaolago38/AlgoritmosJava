package cap1.tipogenerico;

public class Lista<T> {
	public static class Celula<T> {
		T item;
		Celula<T> prox;
	}

	private Celula<T> primeiro, ultimo;

	public Lista() {
		this.primeiro = new Celula<T>();
		this.ultimo = this.primeiro ; this.primeiro.prox = null;
	}
}
