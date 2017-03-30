import java.util.Comparator;
import java.util.TreeMap;

/**
 * Created by user on 2017-03-30.
 */
public class TreeMapExample {
    public static void main(String args[]){
        TreeMap testMap = new TreeMap();
    }
    Comparator<String> secondCharComparator = new Comparator<String>() {
        @Override public int compare(String s1, String s2) {
            return s1.substring(1, 2).compareTo(s2.substring(1, 2));
        }
    };

}
