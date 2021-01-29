package SalesPrediction;

public class SalesPrediction {
    public static void main(String[] args) {

        int totalSales = 4_600_000;
        float eastCoastPercentage = 0.62f;

        double eastCoastSales = totalSales * eastCoastPercentage;

        System.out.printf("East Coast Sales Prediction: $%,.2f\n", eastCoastSales);

        String prediction = String.format("East Coast Sales Prediction: $%,.2f", eastCoastSales);
        System.out.println(prediction);
    }
}
