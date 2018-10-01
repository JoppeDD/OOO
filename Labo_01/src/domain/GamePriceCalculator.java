package domain;

public class GamePriceCalculator implements PriceCalculator {

    @Override
    public double calculatePrice(int nOfDays) {
        double price = 5;
        int daysLeft = nOfDays - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
