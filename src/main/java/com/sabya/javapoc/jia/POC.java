package com.sabya.javapoc.jia;

import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class POC {
    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isHidden();
            }
        });

        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple("Red", 160));
        inventory.add(new Apple("Green", 140));
        inventory.add(new Apple("Yellow", 170));
        inventory.add(new Apple("Red", 130));

        List<Apple> heavyApples1 =
                inventory.stream().filter((Apple a) -> a.getWeight() > 150)
                        .collect(toList());
        List<Apple> heavyApples2 =
                inventory.parallelStream().filter((Apple a) -> a.getWeight() > 150)
                        .collect(toList());

        Map<Currency, List<Transaction>> transactionsByCurrencies =
                new HashMap<>();
        Transaction[] transactions = new Transaction[10];
        for (Transaction transaction : transactions) {
            Currency currency = transaction.getCurrency();
            List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);



        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> threadName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        });

        Future<String> threadName2 = executorService.submit(
                () -> Thread.currentThread().getName());

    }
        interface IntPredicate {
        boolean test(int t);
    }

}
 class AppleFancyFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" :
                "light";
        return "A " + characteristic +
                " " + apple.getColor() +" apple";
    } }

 class AppleSimpleFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}

static class MeaningOfThis {
    public final int value = 4;

    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;

            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    public static void main(String... args) {
        MeaningOfThis m = new MeaningOfThis();
        Object inventory = null;
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello world");
            }
        });
        Thread t1 = new Thread(() -> System.out.println("Hello world"));

        m.doIt();
    }

    Function<BufferedReader, String> f =
            (BufferedReader b) -> {
                try {
                    return b.readLine();
                }
                catch(IOException e) {
                    throw new RuntimeException(e);
                }
            };

    @FunctionalInterface
    public interface BufferedReaderProcessor {
        String process(BufferedReader b) throws IOException;
    }
    BufferedReaderProcessor p = (BufferedReader br) -> br.readLine();

    private static List<Apple> filterApples(Object inventory, Object o) {
        return null;
    }

    int portNumber = 1337;
    Runnable r = () -> System.out.println(portNumber);

    private boolean isValidName(String string) {
        return Character.isUpperCase(string.charAt(0));
    }

    ToIntFunction<String> stringToInt =
            (String s) -> Integer.parseInt(s);

    BiPredicate<List<String>, String> contains =
            (list, element) -> list.contains(element);

    Predicate<String> startsWithNumber =
            (String string) -> this .startsWithNumber(string);

    private boolean startsWithNumber(String string) {
        return true;
    }
    ToIntFunction<String> stringToInt2 = Integer::parseInt;

    ToIntFunction<String> stringTodouble2 = s -> {
        return (int) Double.parseDouble(s);
    };
    BiPredicate<List<String>, String> contains2 = List::contains;
    Predicate<String> startsWithNumber2 = this::startsWithNumber;
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
    Function<Integer, Integer> f1 = x -> x + 1;
    Function<Integer, Integer> g = x -> x * 2;
    Function<Integer, Integer> h = f1.andThen(g);
    int result = h.apply(1);
    Function<Integer, Integer> f3 = x -> x + 1;
    Function<Integer, Integer> g3 = x -> x * 2;
    Function<Integer, Integer> h3 = f3.compose(g3);
    int result2 = h3.apply(1);
}

 class Letter {
     public static String addHeader(String text) {
         return "From Raoul, Mario and Alan: " + text;
     }
     public static String addFooter(String text) {
         return text + " Kind regards";
     }
     public static String checkSpelling(String text) {
         return text.replaceAll("labda", "lambda");
     }
     Function<String, String> addHeader = Letter::addHeader;
     Function<String, String> transformationPipeline
             = addHeader.andThen(Letter::checkSpelling)
             .andThen(Letter::addFooter);

     Function<String, String> addHeader2 = Letter::addHeader;
     Function<String, String> transformationPipeline2
             = addHeader.andThen(Letter::addFooter);

     public double integrate(DoubleFunction<Double> f, double a, double b) {
         return (f.apply(a) + f.apply(b)) * (b - a) / 2.0;
     }
     public double integrate(DoubleUnaryOperator f, double a, double b) {
         return (f.applyAsDouble(a) + f.applyAsDouble(b)) * (b - a) / 2.0;
     }

     static List<Dish> lowCaloricDishes = new ArrayList<>();
     static List<Dish> menu = new ArrayList<>();

     public static void main(String[] args) {
         for(Dish dish: menu) {
             assert dish != null;
             if(dish.getCalories() < 400) {
                 lowCaloricDishes.add(dish);
             } }

         Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
             public int compare(Dish dish1, Dish dish2) {
                 return Integer.compare(dish1.getCalories(), dish2.getCalories());
             }
         });

         List<String> lowCaloricDishesName = new ArrayList<>();
         for(Dish dish: lowCaloricDishes) {
             lowCaloricDishesName.add(dish.getName());
         }

         Dish Dishes = new Dish("pork", false, 800, Dish.Type.MEAT);
         List<String> lowCaloricDishesName2 =
                 menu.parallelStream()
                         .filter(d -> d.getCalories() < 400)
                         .map(Dish::getName)
                         .collect(toList());


         Map<Dish.Type, List<Dish>> dishesByType =
                 menu.stream().collect(groupingBy(Dish::getType));

         List<Dish> menu = Arrays.asList(
                 new Dish("pork", false, 800, Dish.Type.MEAT),
                 new Dish("beef", false, 700, Dish.Type.MEAT),
                 new Dish("chicken", false, 400, Dish.Type.MEAT),
                 new Dish("french fries", true, 530, Dish.Type.OTHER),
                 new Dish("rice", true, 350, Dish.Type.OTHER),
                 new Dish("season fruit", true, 120, Dish.Type.OTHER),
                 new Dish("pizza", true, 550, Dish.Type.OTHER),
                 new Dish("prawns", false, 300, Dish.Type.FISH),
                 new Dish("salmon", false, 450, Dish.Type.FISH) );

         List<String> threeHighCaloricDishNames =
                 menu.stream()
                         .filter(dish -> dish.getCalories() > 300)
                         .map(Dish::getName)
                         .limit(3)
                         .collect(toList());
         System.out.println(threeHighCaloricDishNames);

         List<String> title = Arrays.asList("Modern", "Java", "In", "Action");
         Stream<String> s = title.stream();
         s.forEach(System.out::println);
         s.forEach(System.out::println);

         List<String> names = new ArrayList<>();
         for(Dish dish: menu) {
             names.add(dish.getName());
         }


         List<String> highCaloricDishes = new ArrayList<>();
         Iterator<Dish> iterator = menu.iterator();
         while(iterator.hasNext()) {
             Dish dish = iterator.next();
             if(dish.getCalories() > 300) {
                 highCaloricDishes.add(dish.getName());
             }
         }

         long count = menu.stream()
                 .filter(dish -> dish.getCalories() > 300)
                 .distinct()
                 .limit(3)
                 .count();

         List<Dish> vegetarianDishes = new ArrayList<>();
         for(Dish d: menu) {
             if(d.isVegetarian()){
                 vegetarianDishes.add(d);
             }
         }

         List<Dish> vegetarianDishes2 =
                 menu.stream()
                         .filter(Dish::isVegetarian)
                         .collect(toList());

         List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
         numbers.stream()
                 .filter(i -> i % 2 == 0)
                 .distinct()
                 .forEach(System.out::println);

         List<Dish> specialMenu = Arrays.asList(
                 new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                 new Dish("prawns", false, 300, Dish.Type.FISH),
                 new Dish("rice", true, 350, Dish.Type.OTHER),
                 new Dish("chicken", false, 400, Dish.Type.MEAT),
                 new Dish("french fries", true, 530, Dish.Type.OTHER));

         List<Dish> filteredMenu
                 = specialMenu.stream()
                 .filter(dish -> dish.getCalories() < 320)
                 .collect(toList());

         List<Dish> slicedMenu2
                 = specialMenu.stream()
                 .dropWhile(dish -> dish.getCalories() < 320)
                 .collect(toList());
         List<Dish> dishes = menu.stream()
                 .filter(d -> d.getCalories() > 300)
                 .skip(2)
                 .collect(toList());

         List<Dish> dishes2 =
                 menu.stream()
                         .filter(dish -> dish.getType() == Dish.Type.MEAT)
                         .limit(2)
                         .collect(toList());

         List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
         List<Integer> wordLengths = words.stream()
                 .map(String::length)
                 .collect(toList());

         List<String> uniqueCharacters =
                 words.stream()
                         .map(word -> word.split(""))
                         .flatMap(Arrays::stream)
                         .distinct()
                         .collect(toList());

         String[] arrayOfWords = {"Goodbye", "World"};
         Stream<String> streamOfwords = Arrays.stream(arrayOfWords);
         List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
         List<Integer> squares =
                 numbers2.stream()
                         .map(n -> n * n)
                         .collect(toList());

         List<Integer> numbers1 = Arrays.asList(1, 2, 3);
         List<Integer> numbers23 = Arrays.asList(3, 4);
         List<int[]> pairs =
                 numbers1.stream()
                         .flatMap(i -> numbers2.stream()
                                 .map(j -> new int[]{i, j})
                         )
                         .collect(toList());
         List<int[]> pairs2 =
                 numbers1.stream()
                         .flatMap(i ->
                                 numbers2.stream().
                                 filter(j -> (i + j) % 3 == 0)
                                         .map(j -> new int[]{i, j})
                         )
                                         .collect(toList());

         boolean isHealthy = menu.stream()
                 .allMatch(dish -> dish.getCalories() < 1000);


         boolean isHealthy2 = menu.stream()
                 .noneMatch(d -> d.getCalories() >= 1000);

         Optional<Dish> dish =
                 menu.stream()
                         .filter(Dish::isVegetarian)
                         .findAny();
         menu.stream()
                 .filter(Dish::isVegetarian)
                 .findAny()
                 .ifPresent(dish2 -> System.out.println(dish2.getName()));

         List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
         Optional<Integer> firstSquareDivisibleByThree =
                 someNumbers.stream()
                         .map(n -> n * n)
                         .filter(n -> n % 3 == 0)
                         .findFirst();

         int sum = 0;
         for (int x : numbers) {
             sum += x;
         }

         int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
         int product = numbers.stream().reduce(1, (a, b) -> a * b);
         int sum2 = numbers.stream().reduce(0, Integer::sum);

         Optional<Integer> sum3 = numbers.stream().reduce((a, b) -> (a + b));
         Optional<Integer> min = numbers.stream().reduce(Integer::min);

         int count2 = menu.stream()
                 .map(d -> 1)
                 .reduce(0, (a, b) -> a + b);

         int sumx = numbers.parallelStream().reduce(0, Integer::sum);

         IntStream.rangeClosed(1, 100).filter(b -> Math.sqrt( b*b) % 1 == 0).boxed()
                 .map(b -> new int[]{ b, (int) Math.sqrt(  b * b)});
         IntStream.rangeClosed(1, 100)
                 .filter(b -> Math.sqrt(b*b) % 1 == 0)
                 .mapToObj(b -> new int[]{ b, (int) Math.sqrt( b * b)});
         Stream<int[]> pythagoreanTriples =
                 IntStream.rangeClosed(1, 100).boxed()
                         .flatMap(a ->
                                 IntStream.rangeClosed(a, 100)
                                         .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                                         .mapToObj(b ->
                                                 new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                         );

         Stream<String> stream = Stream.of("Modern ", "Java ", "In ", "Action"); stream.map(String::toUpperCase).forEach(System.out::println);
         Stream<String> emptyStream = Stream.empty();

         String homeValue = System.getProperty("home");
         Stream<String> homeValueStream
                 = homeValue == null ? Stream.empty() : Stream.of(homeValue);

         int[] numbers3 = {2, 3, 5, 7, 11, 13};
         int sums = Arrays.stream(numbers3).sum();
         Stream.iterate(0, n -> n + 2)
                 .limit(10)
                 .forEach(System.out::println);

         Stream.iterate(new int[]{0, 1},
                         t -> new int[]{t[1], t[0]+t[1]})
                 .limit(20)
                 .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
         Stream.iterate(new int[]{0, 1},
                         t -> new int[]{t[1],t[0] + t[1]})
                 .limit(10)
                 .map(t -> t[0])
                 .forEach(System.out::println);


         IntStream.iterate(0, n -> n + 4)
                 .filter(n -> n < 100)
                 .forEach(System.out::println);

         IntStream.iterate(0, n -> n + 4)
                 .takeWhile(n -> n < 100)
                 .forEach(System.out::println);

         Stream.generate(Math::random)
                 .limit(5)
                 .forEach(System.out::println);


         IntStream ones = IntStream.generate(() -> 1);

         long howManyDishes = menu.stream().collect(Collectors.counting());


         IntStream twos = IntStream.generate(new IntSupplier(){
             public int getAsInt(){
                 return 2; }
         });

         long howManyDishes2 = menu.stream().count();


         Comparator<Dish> dishCaloriesComparator =
                 Comparator.comparingInt(Dish::getCalories);
         Optional<Dish> mostCalorieDish =
                 menu.stream()
                         .collect(maxBy(dishCaloriesComparator));

         int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));

         IntSupplier fib = new IntSupplier(){
             private int previous = 0;
             private int current = 1;
             public int getAsInt(){
                 int oldPrevious = this.previous;
                 int nextValue = this.previous + this.current;
                 this.previous = this.current;
                 this.current = nextValue;
                 return oldPrevious;
             } };
         IntStream.generate(fib).limit(10).forEach(System.out::println);

         double avgCalories =
                 menu.stream().collect(averagingInt(Dish::getCalories));
         IntSummaryStatistics menuStatistics =
                 menu.stream().collect(summarizingInt(Dish::getCalories));

         int totalCalories2 = menu.stream().collect(reducing(
                 0, Dish::getCalories, (i, j) -> i + j));

         Optional<Dish> mostCalorieDish3 =
                 menu.stream().collect(reducing(
                         (d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));

     }


 }
 class Trader{
    private final String name;
    private final String city;
    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    } }

 class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;
    public Transaction(Trader trader, int year, int value){
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public Trader getTrader(){
        return this.trader;
    }
    public int getYear(){
        return this.year;
    }
    public int getValue(){
        return this.value;
    }
    public String toString(){
        return "{" + this.trader + ", " +
                "year: "+this.year+", " +
                "value:" + this.value +"}";
    }

     Trader raoul = new Trader("Raoul", "Cambridge");
     Trader mario = new Trader("Mario","Milan");
     Trader alan = new Trader("Alan","Cambridge");
     Trader brian = new Trader("Brian","Cambridge");
     List<Transaction> transactions = Arrays.asList(
             new Transaction(brian, 2011, 300),
             new Transaction(raoul, 2012, 1000),
             new Transaction(raoul, 2011, 400),
             new Transaction(mario, 2012, 710),
             new Transaction(mario, 2012, 700),
             new Transaction(alan, 2012, 950)
     );

     Set<String> cities =
             transactions.stream()
                     .map(transaction -> transaction.getTrader().getCity())
                     .collect(toSet());
     boolean milanBased =
             transactions.stream()
                     .anyMatch(transaction -> transaction.getTrader()
                             .getCity().equals("Milan"));

     Optional<Transaction> smallestTransaction =
             transactions.stream()
                     .reduce((t1, t2) ->
                             t1.getValue() < t2.getValue() ? t1 : t2);


     Optional<Transaction> smallestTransaction2 =
             transactions.stream()
                     .min(comparing(Transaction::getValue));


     IntStream evenNumbers = IntStream.rangeClosed(1, 100) .filter(n -> n % 2 == 0);


     public Currency getCurrency() {
         return null;
     }
     }
 }