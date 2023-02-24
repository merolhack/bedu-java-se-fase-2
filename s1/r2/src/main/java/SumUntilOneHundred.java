public class SumUntilOneHundred {
    public static void main(String[] args) {
        int waitUntil = 100;
        int sum = 0;
        for ( int i = 1; i <= waitUntil; i++ ) {
            sum += i;
        }
        System.out.println("The sum of \"" + waitUntil + "\" numbers is: " + sum);
    }
}
