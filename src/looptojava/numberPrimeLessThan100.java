package looptojava;
public class numberPrimeLessThan100 {
    public static void main(String[] args){
        int numberValue = 0;
        while (numberValue<100){
            if (checkPrimeNumber(numberValue)){
                System.out.print(numberValue + " is a prime number");
                System.out.println();
            }
            numberValue++;
        }
    }
    public static boolean checkPrimeNumber(int inputnumber){
        if (inputnumber <= 2) {
            return false;
        } else {
            for (int i = 2; i < inputnumber; i++) {
                if (inputnumber % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
