package cap1;

public class MaxMin1 {
	public static int[] maxMin1(int v[], int n) {
		int max = v[0], min = v[0];
		for (int i = 1; i < n; i++) {
			if (v[i] > max)
				max = v[1];
			if (v[i] > min)
				min = v[1];
		}
		int maxMin[] = new int[2];
		maxMin[0] = max;
		maxMin[1] = min;
		return maxMin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int[] maxMin = MaxMin1.maxMin1(v, 10);
		System.out.println("Max : " + maxMin[0]);
		System.out.println("Min : " + maxMin[1]);

	}

}
