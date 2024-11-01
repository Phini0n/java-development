package com.pluralsight;

public class Person implements Comparable {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            // If last names are not the same
            if (this.lastName.compareTo(((Person) o).lastName) != 0) {
                return this.lastName.compareTo(((Person) o).lastName);
            } // If first names are not the same
            else if (this.firstName.compareTo(((Person) o).firstName) != 0) {
                return this.firstName.compareTo(((Person) o).firstName);
            } // Default to comparing by age
            else {
                return this.age - ((Person) o).age;
            }
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                "}\n";
    }
}
