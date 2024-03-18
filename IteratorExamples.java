import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(6);
        al.add(9);
        al.add(0);

        ListIterator<Integer> integerListIterator = al.listIterator();
        System.out.println("Next");

        while (integerListIterator.hasNext())
        {
            System.out.print(integerListIterator.next() +" ");
        }
        System.out.println();

        System.out.println("Previous");
        while(integerListIterator.hasPrevious())
        {
            System.out.print(integerListIterator.previous() + " ");
        }

        //Map

        System.out.println("Map");

        Map<Integer,Integer> map = new HashMap<>(5);
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
