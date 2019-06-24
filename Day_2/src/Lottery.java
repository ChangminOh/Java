
public class Lottery {

	int[] Rn;

	Lottery() {
		this.Rn = new int[6];

		
	}

	public static void main(String[] args) {

		Lottery lo = new Lottery();

		lo.Rn[0] = (int) (Math.random() * 45 + 1);

		for (int i = 1; i < lo.Rn.length; i++) {

			lo.Rn[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i ; j++) {
				while (lo.Rn[i] == lo.Rn[j]) {
					lo.Rn[i] = (int) (Math.random() * 45 + 1);
				}
			}
		}
		for (int i = 0; i < lo.Rn.length; i++) {
			System.out.print(lo.Rn[i] + "\t");
		}
	}
}
