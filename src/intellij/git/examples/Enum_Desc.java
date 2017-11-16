package intellij.git.examples;

enum Car {
    Lamborghini(900), Lexus(45),Audi(50),Fiat(15),Honda(12);
    private int price;
    Car(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class Enum_Desc {
    public static void main(String args[]){
        System.out.println("All car prices:");
        for (Car c : Car.values()) System.out.println(
                c + " costs " + c.getPrice() + " thousand dollars.");
    }
}