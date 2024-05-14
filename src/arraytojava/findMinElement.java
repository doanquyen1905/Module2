package arraytojava;
public class findMinElement {
    public static void main(String[] args){
        int[] myArray = {4,5,8,7,12,11};
        System.out.println("Min Value Of Array is: "+ minValue(myArray));
    }
    public static int minValue(int[]array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]< minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
