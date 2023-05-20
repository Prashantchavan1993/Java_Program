public class AmstrongNo {




        public static void isArmstrongNumber(int z) {
            System.out.println("given number is" + " "+z);
            int cube=0;
            int r;
            int t;

            t=z;
            while(z>0) {
                r=z%10;
                z=z/10;
                cube=cube+(r*r*r);
            }
            if(t==cube) {
                System.out.println("this number is armstrong number");
            }else {
                System.out.println("this number is not armstrong number");
            }
        }


        //153    1*1*1    5*5*5  3*3*3


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            isArmstrongNumber(153);
            isArmstrongNumber(199);
            isArmstrongNumber(370);
            isArmstrongNumber(0);
            isArmstrongNumber(1);




        }

    }


