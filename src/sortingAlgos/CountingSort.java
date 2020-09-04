package sortingAlgos;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        countingSort(intArray, 1, 10);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void countingSort(int[] input, int min, int max){

        int[] countingArr = new int[(max-min)+1];

        for(int i = 0; i < input.length; i++){
            countingArr[input[i] - 1]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++){
            while(countingArr[i - min] > 0){
                input[j++] = i;
                countingArr[i - min]--;
            }
        }
    }
}
