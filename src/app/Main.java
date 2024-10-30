package app;

public class Main {

    private static final float CONV_K = 1.60934F;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        float kms = 4;
        float miles = convKmsToMiles(kms);
        System.out.printf("Result is %.2f miles", miles);
    }

    private static float convKmsToMiles(float kms){
        return kms / CONV_K;
    }
}
