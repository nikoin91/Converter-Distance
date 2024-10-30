package app;

public class Main {

    private static final float CONV_K = 1.60934F;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("Version 0.1");

        float kms = 4;
        float mi = 10;
        float miles = convKmsToMiles(kms);
        float kilom = convMilesToKms(mi);
        System.out.printf("Result is %.2f miles" + System.lineSeparator()
                        + "Result is %.2f kilometers", miles , kilom);
    }

    private static float convKmsToMiles(float kms){
        return kms / CONV_K;
    }
    private static float convMilesToKms(float mi) {
        return mi * CONV_K;
    }
}
