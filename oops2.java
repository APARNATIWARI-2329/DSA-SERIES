class Food{
    // define the variables 
    int price;
    String type;
    String likes;

    // function for input values
    Food(int p, String t, String l){
        price = p;
        type = t;
        likes = l;
    }
}

public class oops2 {
    public static void main(String[] args) {
        // making objects and assigning values
        Food f1 = new Food(100, "Dessert", "Pastry");
        Food f2 = new Food(200, "Main Course", "Fried Rice");

        // printing the values
        System.out.println(f1.price + " " + f1.type + " " + f1.likes);
        System.out.println(f2.price + " " + f2.type + " " + f2.likes);
    }
}
