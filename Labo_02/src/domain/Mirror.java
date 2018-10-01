package domain;

public class Mirror implements Ontcijferaar {

    @Override
    public String encypt(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public String decrypt(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
