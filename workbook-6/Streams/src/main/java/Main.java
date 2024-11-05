import com.pluralsight.streams.Person;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 28),
                new Person("Jane", "Doe", 34),
                new Person("John", "Doe", 45),
                new Person("Emily", "Davis", 23),
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

        // Filtering
        List<Person> filteredPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equals(searchName) || person.getLastName().equals(searchName)) {
                filteredPeople.add(person);
            }
        }

        Comparator<Person> byAge = Comparator.comparingInt(Person::getAge);

        OptionalDouble average = filteredPeople
                .stream()
                .mapToDouble(Person::getAge)
                .average();

        // Average
        if (!filteredPeople.isEmpty()) {
            System.out.println("The oldest is: " + Collections.max(filteredPeople, byAge));
            System.out.println("The youngest is: " + Collections.min(filteredPeople, byAge));
            System.out.println("The average is: " + average);

        }
    }
}
