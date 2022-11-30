public class Main {
    public static void main(String[] args) {
        Airpurifier air1 = new Airpurifier();
        System.out.println("This color is " + air1.color);
        System.out.println("This price is " + air1.price);
        System.out.println("This temp is " + air1.temp);
        System.out.println("This power is " + air1.power);

        air1.displayTemp();
        air1.displayPower();
    }
}