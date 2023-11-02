public class Ponies {


    boolean isUnicorn = false;
    boolean isPegasus = false;

    double size = 28.56;

    String name = "Bobby";
    String color = "Pink";


    public void describePony() {
        System.out.println("this is pony" + name + ", and they are" + color + ". The size is " + size + ".");
    }

    public Ponies(String pName, String pColor, Double pSize, Boolean pUnicorn, Boolean pPegasus) {
        System.out.println("hi");
        isUnicorn = false;
        isPegasus = false;
        size = 66.66;
        name = "Bobby";

    }


}
