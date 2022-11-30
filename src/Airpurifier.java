public class Airpurifier {
    String color;
    int price;
    double temp;
    int power;

    void displayTemp(){
        System.out.println("Now Temperature is " + temp + " °C");
    }
    void displayPower(){
        System.out.println("Now Power is " + power + "%");
    }

    Airpurifier (){
        this("red", 1000, 100);
    }

    Airpurifier (String _color, int _price, int _power){
        this.color = _color;
        this.price = _price;
        this.power = _power;
        this.temp = Math.floor((Math.random()) * 50);
    }

}
