package ui;

import domain.Caesar;
import domain.Mirror;
import domain.Ontcijferaar;

public class Encryptor {
    public static void main (String[] args) {

        Ontcijferaar caesar = new Caesar(1);
        Ontcijferaar mirror = new Mirror();

        String encrypt = caesar.encypt("abcdz");
        System.out.println(caesar.encypt("abcdz"));
        System.out.println(caesar.decrypt(encrypt));

        System.out.println(mirror.encypt("test"));
        System.out.println(mirror.decrypt("tset"));
    }
}