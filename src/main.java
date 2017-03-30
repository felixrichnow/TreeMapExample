import java.util.ArrayList;

/**
 * Created by user on 2017-03-30.
 */
public class main {
    public static void main (String[]args){
        Designer testDesigner = new Designer();
        Management testManagement =  new Management();
        ArrayList<Designer> testArray = testManagement.getAccessToDesigners();
        testArray.add(testDesigner);

    }
}
