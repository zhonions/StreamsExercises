import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercises {
    private ProductRepository productRepository;
    private OrderRepository orderRepository;
    private Customer customer;

    public Exercises() {
        productRepository = new ProductRepository();
        orderRepository = new OrderRepository();
        customer = new Customer();
    }

    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        System.out.println(exercises.ex1());
        System.out.println(exercises.ex2());
        System.out.println(exercises.ex3());
        System.out.println(exercises.ex4());
        System.out.println(exercises.ex5());
        System.out.println(exercises.ex6());
        System.out.println(exercises.ex7());
        System.out.println(exercises.ex8());
        System.out.println(exercises.ex9());
        System.out.println(exercises.ex10());
        System.out.println(exercises.ex11());
        System.out.println(exercises.ex12());
        System.out.println(exercises.ex13());
        System.out.println(exercises.ex14());
        System.out.println(exercises.ex15());
    }

    public List<Product> ex1() {

        return productRepository.getAll().stream()
                .filter(product -> (product.getCategory().equals("Books") && product.getPrice() > 100))
                .toList();
    }

    public List<Order> ex2() {
        // Obtain a list of orders with products belonging to category “Baby”
        return orderRepository.getAll().stream()
                .filter(order -> order.getProducts()
                        .stream()
                        .anyMatch(product -> product.getCategory().contains("Baby"))).collect(Collectors.toList());
    }

    public List<Product> ex3() {
        // Obtain a list of products with category = “Toys” and then apply 10% discount
        return productRepository.getAll().stream()
                .filter(product -> product.getCategory().equals("Toys"))
                .map(product -> {
                    double discount = product.getPrice() * 0.10;
                    double finalPrice = product.getPrice() - discount;
                    product.setPrice(finalPrice);
                    return product;
                })
                .collect(Collectors.toList());
    }

    public List<Product> ex4() {
        // Obtain a list of products ordered by customers of tier 2 between 01-Feb-2021 and 01-Apr-2021
        return orderRepository.getAll()
                .stream()
                .filter(order -> order.getCustomer().getTier()==2)
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2021,2,1)) &&
                        order.getOrderDate().isBefore(LocalDate.of(2021,4,1)))
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .toList();
    }

    public Optional<Product> ex5() {
        // Obtain the cheapest product from the “Books” category
        // getAll
        // filter todos da categoria books
        // min
        return productRepository.getAll()
                .stream()
                .filter(product -> product.getCategory().equals("Books"))
                .min(Comparator.comparingDouble(Product::getPrice));
    }

    public List<Order> ex6() {
        // Obtain the 3 most recently placed orders
        // HELPFUL TIP: the method limit() might be useful here ;)
        // getAll
        // sorted desc
        // first by 3 most recently limit
        return orderRepository.getAll()
                .stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Product> ex7() {
        // Obtain the list of orders which were ordered on 15-Mar-2021,
        // log each order to the console and then return their product list
        // HELPFUL TIP: the methods peek() and flatMap() might be useful here ;)
        //get all
        //filter by orderdate 15/03/2021
        //peek sout
        //return product list
        System.out.println();
        return orderRepository
                .getAll()
                .stream()
                .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
                .peek(System.out::println)
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toList());
    }

    public Double ex8() {
        // Calculate total sum of all orders placed in Feb 2021

        return orderRepository
                .getAll()
                .stream()
                .filter(order -> order.getOrderDate().getMonth().equals(Month.FEBRUARY))
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Double ex9() {
        // Calculate average order payment placed on 14-Mar-2021

        return orderRepository
                .getAll()
                .stream()
                .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021,3,14)))
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0);
    }

    public DoubleSummaryStatistics ex10() {
        // Obtain a collection of statistic figures (i.e. sum, average, max, min, count)
        // for all products of category “Books”
        // HELPFUL TIP: the methods mapToDouble() and summaryStatistics() might be useful here ;)
        return productRepository
                .getAll()
                .stream()
                .filter(product -> product.getCategory().equals("Books"))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();
    }

    public Map<Long, Integer> ex11() {
        // Obtain a map with order id as key and each order’s product count as value
        // HELPFUL TIP: the method Collectors.toMap() might be useful here
        return orderRepository
                .getAll()
                .stream()
                .collect(Collectors.toMap(Order::getId,
                        order -> order.getProducts().size()));

    }

    public Map<Customer, List<Order>> ex12() {
        // Obtain a map with orders grouped by customer
        // HELPFUL TIP: the method Collectors.groupingBy() might be useful here ;)
        return orderRepository
                .getAll()
                .stream()
                .collect(Collectors.groupingBy(Order::getCustomer));
    }

    public Map<Order, Double> ex13() {
        // Obtain a map with order as key and the order's products total sum as value
        // HELPFUL TIP: the method Collectors.toMap() might be useful here ;)
        return orderRepository
                .getAll()
                .stream()
                .collect(Collectors.toMap(order -> order,
                        order -> order.getProducts().stream().mapToDouble(Product::getPrice).sum()));
    }

    public Map<String, List<String>> ex14() {
        // Obtain a map with list of product names by category
        // HELPFUL TIP: the method Collectors.groupingBy() might be useful here ;)
        return productRepository
                .getAll()
                .stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toList())));

    }

    public Map<String, Optional<Product>> ex15() {
        // Obtain the most expensive product by category
        // HELPFUL TIP: the method Collectors.groupingBy() might be useful here ;)
        return productRepository.getAll()
                .stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))
                ));
    }
}