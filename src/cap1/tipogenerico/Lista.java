package cap1.tipogenerico;

public class Lista<T> {
	public static class Celula<T> {
		T item;
		Celula<T> prox;
	}

	private Celula<T> primeiro, ultimo;

	public Lista() {
		this.primeiro = new Celula<T>();
		this.ultimo = this.primeiro;
		this.primeiro.prox = null;
	}

	public T pesquisa(T chave) {
		if (this.vazia() || chave == null) {
			Celula<T> aux = this.primeiro;
			while (aux.prox != null) {
				if (aux.prox.item.equals(chave)) {
					return aux.prox.item;
				}
			}
		}
		return null;
	}

	public void insere(T x) {
		this.ultimo.prox = new Celula<T>();
		this.ultimo = this.ultimo.prox;
		this.ultimo.item = x;
		this.ultimo.prox = null;

	}

	public void inserePrimeiro(T item) {
		Celula<T> aux = this.primeiro.prox;
		this.primeiro.prox = new Celula<T>();
		this.primeiro.item = item;
		this.primeiro.prox.prox = aux;
	}

	public T retira(T chave) throws Exception {
		if (this.vazia() || (chave == null)) {
			throw new Exception("Erro: Lista vazia ou chave invalida");

		}
		Celula<T> aux = this.primeiro;
		while (aux.prox != null && !aux.prox.item.equals(chave))
			aux = aux.prox;
		if (aux.prox == null) {
			return null;
		}
		Celula<T> q = aux.prox;
		T item = q.item;
		aux.prox = q.prox;
		if (aux.prox == null)
			this.ultimo = aux;

		return item;

	}

	public T retiraPrimeira() throws Exception {
		if (this.vazia()) {
			throw new Exception("Erro: lista vazia");
		}
		Celula<T> aux = this.primeiro;
		Celula<T> q = aux.prox;
		T item = q.item;
		aux.prox = q.prox;
		if (aux.prox == null)
			this.ultimo = aux;
		return item;
	}

	public boolean vazia() {
		return (this.primeiro == this.ultimo);
	}

	public void imprime() {
		Celula<T> aux = this.primeiro;
		while (aux != null) {
			System.out.println(aux.item.toString());
			aux = aux.prox;
		}
	}

	public boolean estaNaLista(T chave) {
		T obj = this.pesquisa(chave);
		return (obj != null);
	}

}
