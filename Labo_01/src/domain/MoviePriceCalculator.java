package domain;

public class MoviePriceCalculator implements PriceCalculator {

    @Override
    public double calculatePrice(int nOfDays) {
        return nOfDays * 3;
    }
}
