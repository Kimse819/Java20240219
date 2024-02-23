package ch02;

public class C07Character {
    public static void main(String[] args) {
        //char
        //unicode

        char a = 99;
        char b = 120;
        char c = 65535;
//        char d = 99;
        char f = 4314;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("f = " + f);
        char i = 'c';//99

        int o = 0x1f607;

        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);
    }
}
