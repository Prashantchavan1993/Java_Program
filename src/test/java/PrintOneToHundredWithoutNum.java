public class PrintOneToHundredWithoutNum {


        public static void main(String[] args) {

            // 1.first solution
            int one = 'A' / 'A';// 1
            String s = "..........";
            for (int i = one; i <= (s.length() * s.length()); i++) {
                System.out.println(i);
            }
            System.out.println("********");
            // 2.Second solution by using ASCII table
            for (int i = one; i <= 'd'; i++) {
                System.out.println(i);
            }
            System.out.println("*********");
            // 3.Third solution
            String s1 = "programing";
            int zero = s1.length() - s1.length();// 0
            int hundred = s1.length() * s1.length();// 100
            for (int i = zero; i <= hundred; i++) {
                System.out.println(i);
            }
        }
    }


