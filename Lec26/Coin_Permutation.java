package Lec26;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5, 6 };// these no. should be differnt different
		int amount = 10;

		printpermutation(coin, 10, " ");
	}

	public static void printpermutation(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 0; i < coin.length; i++) { //jitne coins h utne recursive call lgegi isliye forloop ka use kiya h
			if (amount >= coin[i]) {
				printpermutation(coin, amount - coin[i], ans + coin[i]);
			}
		}
	}

}
