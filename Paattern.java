class Main {
    public static void main(String[] args) {

        String str = "swiss";

        // Step 1: Frequency array
        int[] count = new int[256];

        // Step 2: Count every character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }


        // =================================================
        // 1. DUPLICATE CHARACTERS
        // =================================================

        System.out.println("Duplicate characters:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (count[ch] > 1) {
                System.out.println(ch + " = " + count[ch]);

                // Avoid printing the same character again
                count[ch] = 0;
            }
        }


        // =================================================
        // 2. UNIQUE CHARACTERS
        // =================================================

        System.out.println("\nUnique characters:");

        // Rebuild frequency array because duplicate section
        // changed some counts to 0
        count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (count[ch] == 1) {
                System.out.println(ch);
            }
        }


        // =================================================
        // 3. FIRST REPEATED CHARACTER
        // =================================================

        System.out.println("\nFirst repeated character:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (count[ch] > 1) {
                System.out.println(ch);
                break;
            }
        }


        // =================================================
        // 4. FIRST NON-REPEATED CHARACTER
        // =================================================

        System.out.println("\nFirst non-repeated character:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (count[ch] == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
