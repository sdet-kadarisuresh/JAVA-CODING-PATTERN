package SDET_JAVA_CODING;

class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "hello world";

        int[] count = new int[256];

        // Count each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Print duplicate characters
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " = " + count[i]);
            }
        }
    }
}
