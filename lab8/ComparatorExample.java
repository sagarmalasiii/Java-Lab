package lab8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ComparatorExample {
	public static void main(String[] args) {
		
		
		        List<Person> personList = new ArrayList<>();
		        personList.add(new Person("John", 30));
		        personList.add(new Person("Alice", 25));
		        personList.add(new Person("Bob", 35));

		        // Sorting the list by age using a Comparator
		        personList.sort(Comparator.comparingInt(Person::getAge));

		        // Printing the sorted list
		        for (Person person : personList) {
		            System.out.println(person);
		        }
		    }
		

		
		
		
	}


