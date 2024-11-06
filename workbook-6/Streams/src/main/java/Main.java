import com.pluralsight.streams.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 28),
                new Person("Jane", "Doe", 34),
                new Person("John", "Doe", 45),
                new Person("Doe", "Davis", 23),
                new Person("David", "Brown", 52),
                new Person("Emily", "Wilson", 19),
                new Person("Daniel", "Brown", 40),
                new Person("Olivia", "Davis", 31),
                new Person("John", "Davis", 27),
                new Person("Olivia", "Martinez", 29)
        );

        // Input
        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine().trim();
        scanner.close();

        // Filtering
        System.out.println("\nPeople with matching name: ");

        List<Person> filteredPeople = people // Source - Data at Rest
                .stream().filter(person -> person.getFirstName().equalsIgnoreCase(searchName)
                        || person.getLastName().equalsIgnoreCase(searchName))
                .toList(); // Destination

        filteredPeople.forEach(System.out::println);

        // Average
        OptionalDouble average = people.stream()
                .mapToDouble(Person::getAge)
                .average();

        double finalAverage = average.orElse(0.0);

        // Output
        Comparator<Person> byAge = Comparator.comparingInt(Person::getAge);
        if (!filteredPeople.isEmpty()) {
            System.out.println("\nThe oldest is: " + Collections.max(people, byAge));
            System.out.println("The youngest is: " + Collections.min(people, byAge));
            System.out.println("The average of all ages is: " + finalAverage);
        }
    }

    /* Leaving this here for reference. Searching for lowest value in a list.
    private static int findOldestAge(List<Person> people) {
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge
    }
     */
}
