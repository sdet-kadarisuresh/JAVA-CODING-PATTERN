
class CountCharacterOccurrence {

    public static void main(String[] args) {

        String str = "hello world";
        char target = 'l';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == target) {
                count++;
            }
        }

        System.out.println("Occurrence of '" + target + "' = " + count);
    }
}
