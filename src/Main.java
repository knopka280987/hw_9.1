
import java.util.HashSet;
import java.util.Set;
import HW9.task1_2.Product;


public class Main {
    public static void main(String[] args) throws ProductException {

        Set<Product> product1 = new HashSet<>();
        product1.add(new Product("Сыр", 250.0, 0.5));
        product1.add(new Product("Лук", 80.0, 0.20));
        product1.add(new Product("Колбаса", 300.0, 0.5));
        product1.add(new Product("Помидоры", 110.0, 0.5));
        product1.add(new Product("Картофель", 20.0, 1.0));
        product1.add(new Product("Кукуруза", 90.0, 0.5));
        product1.add(new Product("Яйца", 65.0, 1.00));

        Set<Product> product2 = new HashSet<>();
        product2.add(new Product("Картошка", 20.0, 0.5));
        product2.add(new Product("Укроп", 50.0, 0.2));
        product2.add(new Product("Лук", 80.0, 0.1));
        product2.add(new Product("Фарш", 180.0, 0.5));

        Set<Recipes> recipes1 = new HashSet<>();
        recipes1.add(new Recipes("Салат", product1));
        recipes1.add(new Recipes("Картошка с фаршем", product2));
        recipes1.add(new Recipes("Салат1", product1));

        System.out.println(recipes1);


        public static void main (String[]args) throws ProductException {


            Product cheese = new Product("Сыр", 250.0, 0.5);
            Product onion1 = new Product("Лук", 80.0, 0.20);
            Product sausage = new Product("Колбаса", 300.0, 0.5);
            Product tomatoes = new Product("Помидоры", 110.0, 0.5);
            Product potato1 = new Product("Картофель", 20.0, 0.5);
            Product corn = new Product("Кукуруза", 90.0, 0.5);
            Product eggs = new Product("Яйца", 65.0, 1.00);

            ProductList product1 = new ProductList();
            product1.addProduct(potato1);
            product1.addProduct(cheese);
            product1.addProduct(corn);
            product1.addProduct(tomatoes);
            product1.addProduct(eggs);

//        System.out.println(product1);
//        product1.delProduct(peas);
//        System.out.println(product1);

            Product potato = new Product("Картошка", 20.0, 0.5);
            Product dill = new Product("Укроп", 50.0, 0.2);
            Product mincedMeat = new Product("Фарш", 180.0, 0.5);
            Product onion = new Product("Лук", 80.0, 0.1);
            ProductList product2 = new ProductList();
            product2.addProduct(potato);
            product2.addProduct(dill);
            product2.addProduct(mincedMeat);
            product2.addProduct(onion);


            Recipes recipes = new Recipes("Салат", product1);
            Recipes recipes0 = new Recipes("Салат", product2);
            Recipes recipes1 = new Recipes("Картошка с фаршем", product2);
            RecipesBook recipesBook = new RecipesBook();
            recipesBook.addRecipes(recipes);
            recipesBook.addRecipes(recipes1);
            recipesBook.addRecipes(recipes0);
            System.out.println(recipesBook);


        }
    }
}