public class PassNullArgWithStringAndObj {





        public static void main(String[] args) {
            // TODO Auto-generated method stub
            // Que:if we pass null argument with method overloading of string and object
            // types what will be output/priority?
            // ans:the priority is always given to child as String is child of object method
            // containing string argument will be executed first.
            test(null);
        }

        public static void test(Object o) {
            System.out.println("object argument");
        }

        public static void test(String s) {
            System.out.println("String argument");
        }

    }


