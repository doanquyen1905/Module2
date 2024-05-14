package classandobject;
import java.util.Random;
public class MainStopWatch {
    public static void main(String[] args){
        int[] myArr = generateRandomArray(100000);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(myArr);
        stopWatch.stop();
        System.out.println("ElapsedTime is " + stopWatch.getElapsedTime()+" ms");
    }
    public static int[] generateRandomArray(int size){
        int []arr = new int[size];
        Random random = new Random();
        for (int i = 0; i <size ; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        int temp;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j <n ; j++) {
               if (arr[minIndex]> arr[j]){
                   minIndex = j;
                   temp = arr[minIndex];
                   arr[minIndex] = arr[i];
                   arr[i] = temp;
               }
            }
        }
    }
}
