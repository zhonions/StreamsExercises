import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ProductRepository {

    public List<Product> getAll() {
        List<Product> products = Arrays.asList(
                new Product(1L, "Tomato", "Vegetables", 1.77, new HashSet<>()),
                new Product(2L, "Pride and Prejudice", "Books", 11.80, new HashSet<>()),
                new Product(3L, "Lotion", "Baby", 5.17, new HashSet<>()),
                new Product(4L, "Ham", "Meats", 3.44, new HashSet<>()),
                new Product(5L, "The Hunger Games", "Books", 13.11, new HashSet<>()),
                new Product(6L, "Diapers", "Baby", 15.77, new HashSet<>()),
                new Product(7L, "Potato", "Vegetables", 2.09, new HashSet<>()),
                new Product(8L, "Apple", "Fruit", 1.58, new HashSet<>())
        );

        products.get(0).getOrders().add(new Order(2L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(1L, "John Bates", 2), Collections.emptySet()));
        products.get(0).getOrders().add(new Order(6L, LocalDate.of(2021, 2, 2), LocalDate.of(2021, 2, 3), "Delivered", new Customer(3L, "Mary Talbot", 3), Collections.emptySet()));
        products.get(0).getOrders().add(new Order(9L, LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 16), "Delivered", new Customer(5L, "Jeremy White", 2), Collections.emptySet()));
        products.get(0).getOrders().add(new Order(10L, LocalDate.of(2021, 2, 16), LocalDate.of(2021, 2, 17), "Delivered", new Customer(5L, "Jeremy White", 2), Collections.emptySet()));

        products.get(1).getOrders().add(new Order(1L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(1L, "John Bates", 2), Collections.emptySet()));
        products.get(1).getOrders().add(new Order(3L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(2L, "Ana Smith", 2), Collections.emptySet()));
        products.get(1).getOrders().add(new Order(10L, LocalDate.of(2021, 2, 16), LocalDate.of(2021, 2, 17), "Delivered", new Customer(5L, "Jeremy White", 2), Collections.emptySet()));

        products.get(2).getOrders().add(new Order(5L, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 16), "Delivered", new Customer(2L, "Ana Smith", 2), Collections.emptySet()));
        products.get(2).getOrders().add(new Order(7L, LocalDate.of(2021, 2, 4), LocalDate.of(2021, 2, 5), "Delivered", new Customer(3L, "Mary Talbot", 3), Collections.emptySet()));
        products.get(2).getOrders().add(new Order(12L, LocalDate.of(2021, 5, 14), LocalDate.of(2021, 5, 15), "Delivered", new Customer(6L, "Emily Masters", 2), Collections.emptySet()));

        products.get(3).getOrders().add(new Order(4L, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 16), "Delivered", new Customer(2L, "Ana Smith", 2), Collections.emptySet()));
        products.get(3).getOrders().add(new Order(6L, LocalDate.of(2021, 2, 2), LocalDate.of(2021, 2, 3), "Delivered", new Customer(3L, "Mary Talbot", 3), Collections.emptySet()));
        products.get(3).getOrders().add(new Order(12L, LocalDate.of(2021, 5, 14), LocalDate.of(2021, 5, 15), "Delivered", new Customer(6L, "Emily Masters", 2), Collections.emptySet()));

        products.get(4).getOrders().add(new Order(3L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(2L, "Ana Smith", 2), Collections.emptySet()));
        products.get(4).getOrders().add(new Order(8L, LocalDate.of(2021, 2, 4), LocalDate.of(2021, 2, 5), "Delivered", new Customer(4L, "Adam Lang", 2), Collections.emptySet()));

        products.get(5).getOrders().add(new Order(3L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(2L, "Ana Smith", 2), Collections.emptySet()));
        products.get(5).getOrders().add(new Order(6L, LocalDate.of(2021, 2, 2), LocalDate.of(2021, 2, 3), "Delivered", new Customer(3L, "Mary Talbot", 3), Collections.emptySet()));
        products.get(5).getOrders().add(new Order(7L, LocalDate.of(2021, 2, 4), LocalDate.of(2021, 2, 5), "Delivered", new Customer(3L, "Mary Talbot", 3), Collections.emptySet()));

        products.get(6).getOrders().add(new Order(4L, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 16), "Delivered", new Customer(2L, "Ana Smith", 2), Collections.emptySet()));
        products.get(6).getOrders().add(new Order(6L, LocalDate.of(2021, 2, 2), LocalDate.of(2021, 2, 3), "Delivered", new Customer(3L, "Mary Talbot", 3), Collections.emptySet()));
        products.get(6).getOrders().add(new Order(11L, LocalDate.of(2021, 2, 21), LocalDate.of(2021, 2, 22), "Delivered", new Customer(5L, "Jeremy White", 2), Collections.emptySet()));
        products.get(6).getOrders().add(new Order(12L, LocalDate.of(2021, 5, 14), LocalDate.of(2021, 5, 15), "Delivered", new Customer(6L, "Emily Masters", 2), Collections.emptySet()));

        products.get(7).getOrders().add(new Order(2L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(1L, "John Bates", 2), Collections.emptySet()));
        products.get(7).getOrders().add(new Order(6L, LocalDate.of(2021, 2, 2), LocalDate.of(2021, 2, 3), "Delivered", new Customer(3L, "Mary Talbot", 3), Collections.emptySet()));
        products.get(7).getOrders().add(new Order(10L, LocalDate.of(2021, 2, 16), LocalDate.of(2021, 2, 17), "Delivered", new Customer(5L, "Jeremy White", 2), Collections.emptySet()));
        products.get(7).getOrders().add(new Order(12L, LocalDate.of(2021, 5, 14), LocalDate.of(2021, 5, 15), "Delivered", new Customer(6L, "Emily Masters", 2), Collections.emptySet()));

        return products;
    }
}
