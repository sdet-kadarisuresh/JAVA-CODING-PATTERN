class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        int[] result = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < index; j++) {

                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.print("Original Array = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("After removing duplicates = ");

        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
