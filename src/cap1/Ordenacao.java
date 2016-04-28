package cap1;

public class Ordenacao {
	public static void ordena(int v[], int n) {
		for (int i = 1; i < n; i++) {
			int min = i;
			for (int j = 1; j < n; j++) {
				if (v[j] < v[min]) {
					min = j;
					int x = v[min];
					v[min] = v[i];
					v[i] = x;
				}
			}
		}
	}

	public static void main(String[] args) {
		int v[] = new int[10];
		v[0] = 5;
		v[2] = 4;
		v[3] = 15;
		v[4] = 12;
		v[5] = 30;
		v[6] = 100;
		v[7] = 200;
		v[8] = 23;
		v[9] = 17;

		Ordenacao.ordena(v, 10);
		for (int i = 1; i < 10; i++) {
			System.out.println("v[" + i + "] : " + v[i]);
		}

	}

}
