import java.util.ArrayList;
import java.util.Iterator;

public class SportsTeam implements Iterable<Person> {
    private ArrayList<Person> people;

    public SportsTeam(ArrayList<Person> people) {
        this.people = people;
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }
}
