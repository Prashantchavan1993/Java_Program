public class FactorialNumber {



        // fact of 3=3*2*1=6
        // fact of 4=4*3*2*1=24
        // 5=5*4*3*2*1=120
        // 1=1
        // fact(0)=1
        // 10=10*9*8*7*6*5*4*3*2*1
        // 1.without recursive ---use for loop(non recursive)
        public static int factorial(int num) {
            int fact = 1;
            if (num == 0)
                return 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;// 1*2*3*4
            }
            return fact;

        }
        // 2.with recursive function--a function is calling itself

        public static int fact(int num) {
            if (num == 0)
                return 1;
            else
                return (num * fact(num - 1));
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            System.out.println("the factorial of is:" + " " + factorial(4));
            System.out.println(factorial(1));
            System.out.println(factorial(0));
            System.out.println("***********");
            System.out.println(fact(3));
            System.out.println(fact(10));
            System.out.println(fact(1));
            System.out.println(fact(0));

        }

    }





