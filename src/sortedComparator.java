import java.util.Comparator;
public class sortedComparator implements Comparator<treeMapNodeOrderHolder> {


    @Override
    public int compare(treeMapNodeOrderHolder o1, treeMapNodeOrderHolder o2 ) {
        Integer x1 = o1.getNumberOfPassengers();
        Integer x2 = o2.getNumberOfPassengers();
         int Comp  = x1.compareTo(x2);
            return Comp;
    }

}




