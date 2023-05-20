public class PalindromeNumber {





        public static void isPalindromeNumber(int z) {

            int r = 0;
            int sum = 0;
            int t;
            t = z;
            while (z > 0) {
                r = z % 10;// get remainder
                sum = sum * 10 + r;
                z = z / 10;
            }
            if (t == sum) {
                System.out.println("palindrome number");
            } else {
                System.out.println("not palindrome number");
            }

        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            isPalindromeNumber(181);
            isPalindromeNumber(981);
            isPalindromeNumber(112211);

        }

    }

