public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ponies pony = new Ponies();
        System.out.println(pony.isUnicorn);
        pony.isUnicorn = true;
        System.out.println(pony.isUnicorn);
    }
}