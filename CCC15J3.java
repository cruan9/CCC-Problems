import java.util.Scanner;

public class CCC15J3 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String word, newWord = "";
		int index = 0, closestDistance = 1000000, closestIndex = 0;
		int [] distances = new int [5];
		int [] vowels = {0, 4, 8, 14, 20};
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		word = in.nextLine();
		for (int i = 0; i < word.length(); i++) {
			newWord += word.charAt(i);
			if (word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u') {
				for (int x = 0; x < alphabet.length; x++) {
					if (word.charAt(i) == alphabet[x]) {
						index = x;
						break;
					}
				}
				for (int y = 0; y < 5; y++) {
					distances[y] = Math.abs(index - vowels[y]);
					if (distances[y] < closestDistance) {
						closestDistance = distances[y];
						closestIndex = vowels[y];
					}
				}
				newWord += alphabet[closestIndex];
				if (alphabet[index] == 'z' || alphabet[index] == 'y')
					newWord += 'z';
				else if (alphabet[index + 1] == 'e' || alphabet[index + 1] == 'i' || alphabet[index + 1] == 'o' || alphabet[index + 1] == 'u')
					newWord += alphabet[index + 2];
				else
					newWord += alphabet[index + 1];
			}
			closestDistance = 10000000;
		}
		System.out.println(newWord);
	}
}