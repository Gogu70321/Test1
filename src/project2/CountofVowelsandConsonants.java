package project2;

public class CountofVowelsandConsonants {

	public static void main(String[] args) {

		String s = "thisisasampleprograihiogjhme";
		int Vowels = 0;
		int consonants = 0;
		int len = s.length();

		for (int i = 0; i < len; i++) {

			char gg = s.charAt(i);

			if (gg == 'a' || gg == 'e' || gg == 'i' || gg == 'o' || gg == 'u') {

				Vowels++;
			} else if (gg >= 'a' && gg <= 'z') {

				consonants++;

			}

		}
		System.out.println("No.of Vowels:" + Vowels);
		System.out.println("No.of Consonants: " + consonants);

	}

}
