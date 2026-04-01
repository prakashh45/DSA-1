class Demo {
    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5};

        int maxCount = 0;
        int maxElement = 100;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Highest frequency element: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}