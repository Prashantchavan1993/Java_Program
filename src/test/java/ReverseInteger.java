public class ReverseInteger {

    public static void main(String[] args) {
            //1.by using while loop
            int num=12345;
            int rev=0;
            while(num!=0) {
                rev=rev*10+num%10;
                num=num/10;
            }
            System.out.println(rev);
            //2.by using StringBuffer
            int num1=654321;
            System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
        }

    }


