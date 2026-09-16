class Main {
    public static void main(String[] args) {

        String str = "hello world java";

        char[] arr = str.toCharArray();

        int start = 0;

        for (int i = 0; i <= arr.length; i++) {

            // Word ends at space or end of String
            if (i == arr.length || arr[i] == ' ') {

                int left = start;
                int right = i - 1;

                // Reverse current word
                while (left < right) {

                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        System.out.println("Original = " + str);
        System.out.println("Output   = " + new String(arr));
    }
}
