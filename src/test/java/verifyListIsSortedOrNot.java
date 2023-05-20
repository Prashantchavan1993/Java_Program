import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verifyListIsSortedOrNot {



        public static void main(String[] args) {
            System.out.println(sortedlist());

        }
        public static boolean sortedlist() {

            List<String> names=  new ArrayList<>(Arrays.asList("sample","test","view"));
            for(int i=0;i<names.size()-1;i++) {
                if(names.get(i).compareTo(names.get(i+1))>0) {
                    return false;
                }
            }
            return true;

        }

    }


