public class SwapWithoutThirdChar {




        public static void main(String[] args) {

            int x=10;
            int y=5;
            //1.by using third variable
//		int t;
//		t=x;
//		x=y;
//		y=t;
//
//		System.out.println(x);
//		System.out.println(y);
            System.out.println("*******");
            //2.by using + operator
//		x=x+y;//15
//		y=x-y;//10
//		x=x-y;
//		System.out.println(x);
//		System.out.println(y);
            System.out.println("*******");
            //3.by using * operator
//		x=x*y;//50
//		y=x/y;//10
//		x=x/y;
//		System.out.println(x);
//		System.out.println(y);
            System.out.println("*******");

            //4.by using xor operator
            x=x^y;//15
            y=x^y;//10
            x=x^y;//5
            System.out.println(x);
            System.out.println(y);


        }

    }


