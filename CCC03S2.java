import java.util.*;
public class CCC03S2 {
	public static char[] vowels = {'a','e','i','o','u'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		for(int i = 0; i < N; i++) {
			String lastword[] = new String[4];
			for(int j = 0; j < 4; j++) {
				String s = in.nextLine();
				lastword[j] = s.substring(s.lastIndexOf(" ") + 1).toLowerCase();
			}
			rhyme(lastword);
		}
		}
	
	public static void rhyme(String[] lastword) {
		String rhyme[] = new String[4];
		boolean vowelfound = false;
		for(int l = 0; l < 4; l++) {	
			for(int j = lastword[l].length()-1; j >= 0; j--) {
				for(int k = 0; k < vowels.length; k++) {
					if(lastword[l].charAt(j) == vowels[k]) {
						rhyme[l] = lastword[l].substring(j);
						vowelfound = true;
						break;
					}
					else if(j == 0 && k == vowels.length-1) {
						vowelfound = true;
						rhyme[l] = lastword[l];
					}
				}
				if(vowelfound) {
					vowelfound = false;
					break;
				}
			}
		}
		if(rhyme[0].equals(rhyme[1]) && rhyme[1].equals(rhyme[2]) && rhyme[2].equals(rhyme[3])){
			System.out.println("perfect");
		}
		else if(rhyme[0].equals(rhyme[1]) && rhyme[2].equals(rhyme[3]) && !rhyme[0].equals(rhyme[2])) {
			System.out.println("even");
		}
		else if(rhyme[0].equals(rhyme[2]) && rhyme[1].equals(rhyme[3]) && !rhyme[0].equals(rhyme[1])) {
			System.out.println("cross");
		}
		else if(rhyme[0].equals(rhyme[3]) && rhyme[1].equals(rhyme[2]) && !rhyme[0].equals(1)) {
			System.out.println("shell");
		}
		else {
			System.out.println("free");
		}
		
		
	}
}