import java.util.ArrayList;
import java.util.List;

public class FindMinNumExample {

    public static void main(String[] args) {

        int [] array = {24,34,45,67,5,43,65};

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            int minValue =  array[i];
            if( min < minValue){
                min = minValue;
            }

            int maxValue =  array[i];
            if(max < maxValue){
                max = maxValue;
            }
        }
        System.out.println( " Min : " + min +  "  ---- " + "Max : " + max  );
    }

}
