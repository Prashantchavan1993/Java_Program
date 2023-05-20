import java.util.HashMap;
import java.util.Set;

public class StringCount {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            String s="This is testing program testing program";
            String words[]=s.split(" ");
            HashMap<String,Integer> map= new HashMap<String,Integer>();
            for(String word:words) {
                if(map.containsKey(word)) {
                    map.put(word, map.get(word)+1);
                }else {
                    map.put(word, 1);
                }
            }
            Set<String> keys=map.keySet();
            for(String key:keys) {
                System.out.println(key);
                System.out.println(map.get(key));
            }

        }

    }


