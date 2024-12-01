public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];
        double counter = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        for(int i = 2; i < arr.length; i++)  {
            for(int j = 0; j < arr.length; j++){
                if( j != i && j % i == 0) {
                    arr[j] = false;
                }
            }
            }
            System.out.println("Prime numbers up to " + n + ":");
            for (int i = 2; i < arr.length; i++){
                if (arr[i] == true) {System.out.println(i); counter++;}
            }
            double perc = (counter / n) * 100;

            System.out.println("There are " + (int) counter + " primes between 2 and " + n + " (" + (int) perc + "% are primes)");
        }



    }
