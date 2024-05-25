package com.sabya.javapoc.jia;

import org.assertj.core.api.InstanceOfAssertFactories;
import org.mockito.stubbing.Answer;

import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

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

    public interface IntPredicate {
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

class MeaningOfThis {
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

         Dish Dishes = new Dish();
         List<String> lowCaloricDishesName2 =
                 menu.parallelStream()
                         .filter(d -> d.getCalories() < 400)
                         .map(Dish::getName)
                         .collect(toList());


         Map<Dish.Type, List<Dish>> dishesByType =
                 menu.stream().collect(groupingBy(Dish::getType));

     }


 }
