

import java.util.List;
import java.util.ArrayList;
/**
 * Sample
 */
public class Sample {

    public static void main(String[] args) {
        int a, b, c, sum=12;

        // List<PythagoreanTriplet> tripletsList = new ArrayList<>();

        for (a = 1; a <= sum/2; a++) {
            for (b = a+1; b <= (sum-a)/2; b++) {
                if ( b != a) {
                    c = sum - a - b;
                    if (c != b && a*a + b*b == c*c) {
                        System.out.println(a + "  " + b + "  " + c);

                        // tripletsList.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
        }

        // System.out.println()
    }   

}