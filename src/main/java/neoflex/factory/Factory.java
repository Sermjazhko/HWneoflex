package neoflex.factory;

public class Factory {

    public void start(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);
        setCoffee(coffee);
        System.out.println("Кофе готовится");
    }

    public void setCoffee(Coffee coffee) {
        coffee.chooseCoffee();
    }
}
