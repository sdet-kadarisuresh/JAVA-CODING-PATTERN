package SDET_JAVA_CODING;

class CountVowelsConsonants {
    public static void main(String[] args) {

        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        int specialCharacters = 0;
        int numbers = 0;

        String str = "Today is mon23day!@, yes ! bro";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check alphabet
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

                // Check vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                    vowels++;
                } else {
                    consonants++;
                }
            }

            // Check number
            else if (ch >= '0' && ch <= '9') {
                numbers++;
            }

            // Check space
            else if (ch == ' ') {
                spaces++;
            }

            // Everything else is a special character
            else {
                specialCharacters++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Numbers = " + numbers);
        System.out.println("Special Characters = " + specialCharacters);
        System.out.println("Spaces = " + spaces);
    }
}
