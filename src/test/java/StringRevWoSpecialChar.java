public class StringRevWoSpecialChar {




        public static void main(String[] args) {
            // TODO Auto-generated method stub
            String s="abcd$efg&";
            int len= s.length();
            char [] arr= new char[len];
            for(int i=0;i<len;i++) {
                char ch=s.charAt(i);
                if(Character.isAlphabetic(ch)) {
                    arr[len-1-i] = ch;
                }else {
                    arr[i]= ch;
                }
            }
            System.out.println(new String (arr));
        }

    }



