package cap1;

public class Max {
	public static int max(int v[], int n) {
		int max = v[0];
		for (int i = 1; i < n; i++)
			if (max < v[i])
				max = v[i];
		return max;
	}

	public static Item max(Item v[], int n) {
		Item max = v[0];
		for (int i = 1; i < n; i++)
			if (max.compara(v[1]) < 0)
				max = v[i];
		return max;
	}
}
