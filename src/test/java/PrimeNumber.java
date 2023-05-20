public class PrimeNumber {




        public static boolean isPrimeNumber(int a) {
            // edge/ corner cases
            if (a <= 1) {
                return false;
            }
            for (int i = 2; i < a; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;

        }

        public static void getPrimeNumber(int a) {
            for (int i = 2; i <= a; i++) {
                if (isPrimeNumber(i)) {
                    System.out.println(i + " is a prime number  ");
//			} else {
//			System.out.println(i+ " is not a prime number");
//			}
                }
            }
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
//		System.out.println("2 is prime number:" + " " + isPrimeNumber(2));
//		System.out.println("1 is prime number:" + " " + isPrimeNumber(1));
//		System.out.println("3 is prime number:" + " " + isPrimeNumber(3));
//		System.out.println("-2 is prime number:" + " " + isPrimeNumber(-2));
//		System.out.println("0 is prime number:" + " " + isPrimeNumber(0));
//
            getPrimeNumber(7);
            getPrimeNumber(20);

        }

    }


