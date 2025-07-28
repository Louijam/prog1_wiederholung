package Aufgabe_5;

public class Main {
    public static void main(String[] args) {

        testEinkaufswagen();

    }

    public static void testEinkaufswagen(){

        Einkaufswagen cart=new Einkaufswagen();
        System.out.println(cart.size());
        cart.addToCart("Birne");
        cart.addToCart("Salat");
        cart.addToCart("Paprika");
        cart.addToCart("Berliner");
        cart.addToCart("Kohl");
        cart.addToCart("Berlin");

        cart.showContent();

        cart.removeFromCart("Cornflakes");
        cart.removeFromCart("Birne");
        cart.showContent();

    }
}
