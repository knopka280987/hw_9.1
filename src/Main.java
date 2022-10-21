
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> product1 = new HashSet<>();
        product1.add(new Product("Сыр", 250.0, 0.5));
        product1.add(new Product("Масло", 210.0, 0.80));
        product1.add(new Product("Колбаса", 300.0, 0.5));


        System.out.println(product1);
    }
}