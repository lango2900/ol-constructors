public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("thicc crust","tomato", "mots");

        System.out.println("Here are the ingredients of your pizza gangnem:  ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);






    }
}



// what if we dont want any toppings -_-
// if we used Pizza pizza = new Pizza("thicc crust","tomato", "mots",) without our topping, errors
// need to use overloaded constructors for this


// now say we get rid of da cheeze - need constructor that takes 2 strings

