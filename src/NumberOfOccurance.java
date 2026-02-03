public class NumberOfOccurance {

    public static void main(String[] args) {

        int[] mainArray = {345,35,35,75,35,5345,76,4,3,8,553,56,5,3,5,74,53,75,73,45,564,6,7,56,37,5};

        int n = mainArray.length;
        int i = 0;

        while (i < n) {
            int count = 1;
            int j = i + 1;

            while (j < n) {
                if (mainArray[i] == mainArray[j]) {
                    count++;
                    mainArray[j] = -1; // mark as counted
                }
                j++;
            }

            if (mainArray[i] != -1) {
                System.out.println(mainArray[i] + " occurs " + count + " times");
            }
            i++;
        }
    }
}
