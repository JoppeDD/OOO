package domain;

public class Caesar implements Ontcijferaar{

    private int key;

    public Caesar(int key) {
        setKey(key);
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    @Override
    public String encypt(String msg) {
        String s = "";
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) + this.key);
            if (c > 'z')
                s += (char)(msg.charAt(x) - (26-this.key));
            else
                s += (char)(msg.charAt(x) + this.key);
        }
        return s;
    }

    @Override
    public String decrypt(String msg) {
        String s = "";
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) - this.key);
            if (c < 'a')
                s += (char)(msg.charAt(x) + (26-this.key));
            else
                s += (char)(msg.charAt(x) - this.key);
        }
        return s;
    }
}
