import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Grapes");
        al.add("Berries");

       //Collection<String> newList = Collections.unmodifiableCollection(al);
        List<String> newList = Collections.unmodifiableList(al);
        al.add("Orange");

        //UnSupportedModificationException
      //  newList.add("Orange");
        al.add("Banana");
        al.add("Watermelon");
        System.out.println("old list"+al);
        System.out.println("New List: "+newList);

    }
}
