import java.util.ArrayList;
import java.util.Iterator;

public class StudyGroup implements Iterable<Person> {
    private Person[] people;

    public StudyGroup(Person[] people) {
        this.people = people;
    }

    @Override
    public Iterator<Person> iterator() {
        return new Iterator<Person>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < people.length;
            }

            @Override
            public Person next() {
                if (!hasNext()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                return people[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

