public class SwapString {


        public static void main(String[] args) {

            String a = "Selenium";
            String b = "Java";
            System.out.println("before swapping");
            System.out.println("value of a is:" + a);
            System.out.println("value of b is:" + b);
            // 1.append a and b
            a = a + b;// SeleniumJava
            // 2.store initial value of string a to string b
            b = a.substring(0, a.length() - b.length());// Selenium
            // 3.Store initial value of string b to string a
            a = a.substring(b.length());
            System.out.println("after swapping value of a and b is:");
            System.out.println("Value of a is:" + a);
            System.out.println("value of b is:" + b);
        }

    }


