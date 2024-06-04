/**
 * Findmissinf
 */
import java.util.ArrayList;
import java.util.List;
 class Findmissinf {

    public static int find(ArrayList<Integer> list){

        int n = list.size()+1;
        int total = n*(n+1)/2 ;

        for(int num : list){
            total -=num;
        }
        return total;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,4,5,6,7));
        find(list);
        System.out.println(list);
    }
}