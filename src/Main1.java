import java.util.ArrayList;

public class Main1{
    public static void main(String[] args) {

        Person[] peopleArray = {
                new Person("Alice", 20, false),
                new Person("Bob", 22, true)
        };
        StudyGroup studyGroup = new StudyGroup(peopleArray);


        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Charlie", 18, false));
        peopleList.add(new Person("David", 21, true));
        SportsTeam sportsTeam = new SportsTeam(peopleList);

        // Display all components
        System.out.println("Study group:");
        for (Person person : studyGroup) {
            System.out.println(person);
        }

        System.out.println("Sports team:");
        for (Person person : sportsTeam) {
            System.out.println(person);
        }

        for (Person person : studyGroup) {
            person.setAge(person.getAge() + 1);
        }

        for (Person person : sportsTeam) {
            person.setAge(person.getAge() + 1);
        }

        System.out.println("Study group after a year:");
        for (Person person : studyGroup) {
            System.out.println(person);
        }

        System.out.println("Sports team after a year:");
        for (Person person : sportsTeam) {
            System.out.println(person);
        }

    }
}
