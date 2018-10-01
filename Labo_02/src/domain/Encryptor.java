package domain;

public class Encryptor {
    public static void main (String[] args) {

        Ontcijferaar caesar = new Caesar(1);
//        Ontcijferaar mirror = new Mirror();

        String encrypt = caesar.encypt("abcdz");
        System.out.println(caesar.encypt("abcdz"));
        System.out.println(caesar.decrypt(encrypt));

    }
}
