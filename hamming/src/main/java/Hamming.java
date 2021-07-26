public class Hamming {

    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

    }

    int getHammingDistance() {
        int hammingDistance = 0;
        int count = 0;
        for (char c : leftStrand.toCharArray()) {
            if (c != rightStrand.toCharArray()[count]) {
                hammingDistance++;
            }
            count++;
        }
        return hammingDistance;
    }
}
