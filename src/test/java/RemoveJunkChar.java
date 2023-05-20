public class RemoveJunkChar {

    public static void main(String[] args) {

            String s="%$@#somanath*&#@jadhav";
            //by using regular expression:
            s=s.replaceAll("[^a-zA-z0-9]"," ");
            System.out.println(s);
        }

    }


