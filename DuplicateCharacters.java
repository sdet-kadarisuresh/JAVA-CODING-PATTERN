package SDET_JAVA_CODING;

class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "hello world";

        int[] count = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Find duplicate characters
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (count[ch] > 1) {
                System.out.println(ch + " = " + count[ch]);

                // Avoid printing the same duplicate again
                count[ch] = 0;
            }
        }
    }
}
