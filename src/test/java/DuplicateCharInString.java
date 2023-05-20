public class DuplicateCharInString {




        public static void main(String[] args) {
            String s = "somanath prataprao jadhav";
            char string[] = s.toCharArray();
            System.out.println("The given String is ::" + s);
            System.out.print("The Duplicate characters in above string are:");
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (string[i] == string[j]) {
                        System.out.print(string[j] + " ");
                        break;
                    }
                }
            }
        }

    }


