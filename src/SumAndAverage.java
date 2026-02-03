public class SumAndAverage {
    static void main(String[] args) {
        int[] Narray = {23,34,535,43,54,54,54,456,567,57 };
        int totalsum = 0;
        int i = 0;
        while(i <= Narray.length - 1){
            totalsum += Narray[i];
            i++;
        }
        System.out.println("total of array is " + totalsum);
        float AverageOfArray = (float) totalsum / Narray.length;
        System.out.println("the average of the array is "+ AverageOfArray);

    }
}