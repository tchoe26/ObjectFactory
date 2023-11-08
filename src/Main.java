public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TennisPlayer abc;
        abc = new TennisPlayer(47, 140, true, 1, "Nick Kyrgios", 1999);
        abc.describeTennisPlayer();

        Ponies p = new Ponies("bobby", "yellow", 66.66, false, true);

        Ponies a;
        a = new Ponies("Teddy", "pink", 21.0, true, true);


        Ponies lol;
        lol = new Ponies("Eli", "blue", 42.0, false, true);
        Ponies hehe;
        hehe = new Ponies("hehe", "blue", 123.4, false, true);
        hehe.describePony();

        lol.describePony();

        Calculator lmao;
        lmao = new Calculator();


    }
}