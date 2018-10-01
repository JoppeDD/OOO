package domain;

public abstract class Product {

    private int id;
    private String title;
    private PriceCalculator pc;

    public Product(int id, String title, PriceCalculator pc) {
        setId(id);
        setTitle(title);
        setPc(pc);
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    public void setPc(PriceCalculator pc) {
        this.pc = pc;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice(int nOfDays) {
        return pc.calculatePrice(nOfDays);
    }
}
