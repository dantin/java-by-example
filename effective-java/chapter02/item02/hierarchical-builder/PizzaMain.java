// https://stackoverflow.com/questions/1963983/in-java-static-members-of-the-default-package-cannot-be-imported-can-some-on
// Static Members of the default package cannot be imported
public class PizzaMain {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
            .addTopping(Pizza.Topping.SAUSAGE)
            .addTopping(Pizza.Topping.ONION)
            .build();
        Calzone calzone = new Calzone.Builder()
            .addTopping(Pizza.Topping.HAM)
            .sauceInside()
            .build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
