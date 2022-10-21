
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

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
        recipes1.add(new Recipes("Салат",  product1));
        recipes1.add(new Recipes("Картошка с фаршем", product2));
        recipes1.add(new Recipes("Салат1",  product1));

        System.out.println(recipes1);
    }
}