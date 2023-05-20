public class PalindromeString {





        public static void main(String[] args) {
            // TODO Auto-generated method stub

            String s="peep";
            String d="";
            for(int i=s.length()-1;i>=0;i--) {
                d=d+s.charAt(i);
            }
            System.out.println(d);
            System.out.println(d.equals(d));


            String x="ram";
            String y="";
            for(int i=x.length()-1;i>=0;i--) {
                y=y+x.charAt(i);
            }
            System.out.println(y);
            System.out.println(y.equals(x));


            String v="teet";
            String n="";
            for(int i=v.length()-1;i>=0;i--) {
                n=n+v.charAt(i);
            }
            System.out.println(n);
            System.out.println(n.equals(v));


            String p="012210";
            String q="";
            for(int i=p.length()-1;i>=0;i--) {
                q=q+p.charAt(i);
            }
            System.out.println(q);
            System.out.println(q.equals(p));



        }



    }


