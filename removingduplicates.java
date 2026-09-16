class Main {
    public static void main(String[] args) {

        String str = "swiss";

        boolean[] seen = new boolean[256];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        System.out.println("Original String = " + str);
        System.out.println("After removing duplicates = " + result);
    }
}
