import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class PythagoreanTriplet {
    
    int a, b, c;
    int sum;

    PythagoreanTriplet() {
        // this.a = 0;
        // this.b = 0;
        // this.c = 0;
    }

    PythagoreanTriplet (int a1, int b1, int c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;

        return this.a == ((PythagoreanTriplet) obj).a && this.b == ((PythagoreanTriplet) obj).b && this.c == ((PythagoreanTriplet) obj).c;
    }


    static PythagoreanTripletHelper makeTripletsList() {
        // List<PythagoreanTriplet> ptList = new ArrayList<PythagoreanTriplet>();
        // PythagoreanTriplet pt = new PythagoreanTriplet();

        return new PythagoreanTripletHelper();
    }

    static class PythagoreanTripletHelper {

        int a, b, c;
        int sum;


        PythagoreanTripletHelper withFactorsLessThanOrEqualTo(int N) {

            sum = N;
            
            return this;
        }
    
        PythagoreanTripletHelper thatSumTo(int N) {
            return this;
        }
        
        List<PythagoreanTriplet> build () {
    
            List<PythagoreanTriplet> tripletsList = new ArrayList<>();
    
            for (int a = 1; a <= sum/2; a++) {
                for ( int b = a+1; b <= (sum-a)/2; b++) {
                    if ( b != a) {
                        int c = sum - a - b;

                        if (c != b && a*a + b*b == c*c) {
                            tripletsList.add(new PythagoreanTriplet(a, b, c));
                        }
                    }
                }
            }
    
            return tripletsList;
            // return Collections.singletonList(new PythagoreanTriplet(a, b, c));
            // return new ArrayList<PythagoreanTriplet>();
        }

    }
    
    
}