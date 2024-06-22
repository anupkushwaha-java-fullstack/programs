import java.util.ArrayList;
import java.util.List;

public class Triplets {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();//17 28 30
        a.add(17);
        a.add(28);
        a.add(30);

        List<Integer> b = new ArrayList<>();//17 28 30
        b.add(99);
        b.add(16);
        b.add(8);

        //99 16 8
        List<Integer> result =  compareTriplets(a,b);
        System.out.println("result:: " + result.toString());
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int scorea = 0;
        int scoreb = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            int one = a.get(i);
            int second = b.get(i);

            if (one > second) {
                scorea = scorea + 1;
            }

            if (one < second) {
               scoreb = scoreb + 1;
            }

        }
        result.add(0,scorea);
        result.add(1,scoreb);
        return result;
    }
}