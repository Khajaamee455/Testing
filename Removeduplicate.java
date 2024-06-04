import java.util.HashSet;
import java.util.*;

public class Removeduplicate {

  public static void remove(ArrayList<Integer> list){

    HashSet<Integer> set = new HashSet<>(list);
    list.clear();
    list.addAll(set);
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(List.of(1,2,2,3,3,4,4,66,4,6,66,9));
    remove(list);
    System.out.println(list);
  }
    
}
