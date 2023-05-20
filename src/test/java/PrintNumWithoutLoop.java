public class PrintNumWithoutLoop {




        static int i=0;

        public static void main(String[] args) {

            if(i<=100) {
                System.out.println(i++);
                main(null);
            }
        }

    }


