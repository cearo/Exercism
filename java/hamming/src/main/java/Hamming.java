import java.util.List;
import java.util.stream.IntStream;

public class Hamming {
    int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {

        if (leftStrand.equals("") && !rightStrand.equals(""))
            throw new IllegalArgumentException("left strand must not be empty.");

        else if (rightStrand.equals("") && !leftStrand.equals(""))
            throw new IllegalArgumentException("right strand must not be empty.");

        else if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        else {
            if (leftStrand.equals(rightStrand))
                hammingDistance = 0;
            else {
                for (int i = 0; i < leftStrand.length(); i++) {
                    if (leftStrand.charAt(i) != rightStrand.charAt(i))
                        hammingDistance++;
                }
            }
        }
    }

    public int getHammingDistance() {
        return this.hammingDistance;
    }
}
