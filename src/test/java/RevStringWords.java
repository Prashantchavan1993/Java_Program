public class RevStringWords {


    public static void main(String[] args) {
            String s = "I Love My India";
            String rev[]=s.split(" ");
            for(int i=rev.length-1;i>=0;i--) {
                System.out.print(rev[i]+" ");
            }
        }

    }


