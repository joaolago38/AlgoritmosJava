package cap1;

public class EncontraMax {
	public static void main(String[] args) {
		MeuItem itens[] = new MeuItem[2];
		itens[0] = new MeuItem(3);
		itens[1] = new MeuItem(10);
		MeuItem max = (MeuItem) Max.max(itens, 2);
		System.out.println("A maior chave => " + max.chave);
	}
}
