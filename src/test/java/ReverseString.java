public class ReverseString {





        public static void main(String[] args) {

            String s="somanath";
            //1.by using for loop
            int len=s.length();
            String rev="";
            for(int i=len-1;i>=0;i--) {
                rev=rev+s.charAt(i);
            }
            System.out.println(rev);
            //2.by using String Buffer:
            StringBuffer sb=new StringBuffer(s);
            System.out.println(sb.reverse());
        }


}
