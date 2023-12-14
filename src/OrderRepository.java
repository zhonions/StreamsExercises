import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class OrderRepository {

    public List<Order> getAll() {
        List<Order> orders = Arrays.asList(
                new Order(1L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(1L, "John Bates", 2), new HashSet<>()),
                new Order(2L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(1L, "John Bates", 2), new HashSet<>()),
                new Order(3L, LocalDate.of(2021, 3, 14), LocalDate.of(2021, 3, 15), "Delivered", new Customer(2L, "Ana Smith", 2), new HashSet<>()),
                new Order(4L, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 16), "Delivered", new Customer(2L, "Ana Smith", 2), new HashSet<>()),
                new Order(5L, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 16), "Delivered", new Customer(2L, "Ana Smith", 2), new HashSet<>()),
                new Order(6L, LocalDate.of(2021, 2, 2), LocalDate.of(2021, 2, 3), "Delivered", new Customer(3L, "Mary Talbot", 3), new HashSet<>()),
                new Order(7L, LocalDate.of(2021, 2, 4), LocalDate.of(2021, 2, 5), "Delivered", new Customer(3L, "Mary Talbot", 3), new HashSet<>()),
                new Order(8L, LocalDate.of(2021, 2, 4), LocalDate.of(2021, 2, 5), "Delivered", new Customer(4L, "Adam Lang", 2), new HashSet<>()),
                new Order(9L, LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 16), "Delivered", new Customer(5L, "Jeremy White", 2), new HashSet<>()),
                new Order(10L, LocalDate.of(2021, 2, 16), LocalDate.of(2021, 2, 17), "Delivered", new Customer(5L, "Jeremy White", 2), new HashSet<>()),
                new Order(11L, LocalDate.of(2021, 2, 21), LocalDate.of(2021, 2, 22), "Delivered", new Customer(5L, "Jeremy White", 2), new HashSet<>()),
                new Order(12L, LocalDate.of(2021, 5, 14), LocalDate.of(2021, 5, 15), "Delivered", new Customer(6L, "Emily Masters", 2), new HashSet<>())
        );

        orders.get(0).getProducts().add(new Product(2L, "Pride and Prejudice", "Books", 11.80, Collections.emptySet()));

        orders.get(1).getProducts().add(new Product(1L, "Tomato", "Vegetables", 1.77, Collections.emptySet()));
        orders.get(1).getProducts().add(new Product(8L, "Apple", "Fruit", 1.58, Collections.emptySet()));

        orders.get(2).getProducts().add(new Product(2L, "Pride and Prejudice", "Books", 11.80, Collections.emptySet()));
        orders.get(2).getProducts().add(new Product(5L, "The Hunger Games", "Books", 13.11, Collections.emptySet()));
        orders.get(2).getProducts().add(new Product(6L, "Diapers", "Baby", 15.77, Collections.emptySet()));

        orders.get(3).getProducts().add(new Product(4L, "Ham", "Meats", 3.44, Collections.emptySet()));
        orders.get(3).getProducts().add(new Product(7L, "Potato", "Vegetables", 2.09, Collections.emptySet()));

        orders.get(4).getProducts().add(new Product(3L, "Lotion", "Baby", 5.17, Collections.emptySet()));

        orders.get(5).getProducts().add(new Product(1L, "Tomato", "Vegetables", 1.77, Collections.emptySet()));
        orders.get(5).getProducts().add(new Product(7L, "Potato", "Vegetables", 2.09, Collections.emptySet()));
        orders.get(5).getProducts().add(new Product(8L, "Apple", "Fruit", 1.58, Collections.emptySet()));
        orders.get(5).getProducts().add(new Product(4L, "Ham", "Meats", 3.44, Collections.emptySet()));
        orders.get(5).getProducts().add(new Product(6L, "Diapers", "Baby", 15.77, Collections.emptySet()));

        orders.get(6).getProducts().add(new Product(3L, "Lotion", "Baby", 5.17, Collections.emptySet()));
        orders.get(6).getProducts().add(new Product(6L, "Diapers", "Baby", 15.77, Collections.emptySet()));

        orders.get(7).getProducts().add(new Product(5L, "The Hunger Games", "Books", 13.11, Collections.emptySet()));

        orders.get(8).getProducts().add(new Product(1L, "Tomato", "Vegetables", 1.77, Collections.emptySet()));

        orders.get(9).getProducts().add(new Product(2L, "Pride and Prejudice", "Books", 11.80, Collections.emptySet()));
        orders.get(9).getProducts().add(new Product(1L, "Tomato", "Vegetables", 1.77, Collections.emptySet()));
        orders.get(9).getProducts().add(new Product(8L, "Apple", "Fruit", 1.58, Collections.emptySet()));

        orders.get(10).getProducts().add(new Product(7L, "Potato", "Vegetables", 2.09, Collections.emptySet()));

        orders.get(11).getProducts().add(new Product(7L, "Potato", "Vegetables", 2.09, Collections.emptySet()));
        orders.get(11).getProducts().add(new Product(8L, "Apple", "Fruit", 1.58, Collections.emptySet()));
        orders.get(11).getProducts().add(new Product(4L, "Ham", "Meats", 3.44, Collections.emptySet()));
        orders.get(11).getProducts().add(new Product(3L, "Lotion", "Baby", 5.17, Collections.emptySet()));

        return orders;
    }
}
