
public class Fila {
	public static void main(String[] args) {

	}

	int tamanho;
	int[] fila;
	int inicio;
	int fim;

	public Fila(int tamanho) {
		this.tamanho = tamanho;
		this.fila = new int[tamanho];
		this.inicio = -1;
		this.fim = -1;
	}

	public boolean isEmpty() {
		if (this.inicio == -1 && this.fim == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (((fim + 1) % tamanho) == this.fim) {
			return true;
		}
		return false;
	}

	public void add(int elemento) {
		if (isFull()) {
			throw new RuntimeException("Fila cheia");
		} else if (isEmpty()) {
			this.inicio = 0;
			this.fim = 0;
			fila[fim] = elemento;
		} else {
			this.fim = (fim + 1) % this.tamanho;
			this.fila[this.fim] = elemento;
		}
	}

	public void remove() {
		if (isEmpty()) {
			throw new RuntimeException("Fila vazia");
		} else if (this.inicio == this.fim) {
			this.inicio = -1;
			this.fim = -1;
		}

		else {
			this.inicio = (inicio + 1) % tamanho;
		}

	}

	public int elemento() {
		if (isEmpty()) {
			throw new RuntimeException("Fila vazia");
		}
		return fila[this.inicio];
	}

	public String print() {
		String saida = "";
		if (isEmpty()) {
			throw new RuntimeException("Fila vazia");
		}

		else {
			int indice = inicio;
			while (indice != fim) {
				saida += fila[indice];
				indice = (indice + 1) % tamanho;
			}

		}
		return saida.trim();
	}

}
