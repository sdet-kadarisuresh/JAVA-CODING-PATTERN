// Find Unique Characters

class UniqueCharacters {

    public static void main(String[] args) {

        String str = "abcdabf";

        int[] count = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Find unique characters
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (count[ch] == 1) {
                System.out.println(ch + " = " + count[ch]);

                // Avoid duplicate checking/printing
                count[ch] = 0;
            }
        }
    }
}
