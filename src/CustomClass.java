import java.util.Iterator;

public class CustomClass implements Iterable<Integer> {
    private int singleInt1;
    private int singleInt2;
    private int[] intArray;
    private char singleChar;

    public CustomClass(int singleInt1, int singleInt2, int[] intArray, char singleChar) {
        this.singleInt1 = singleInt1;
        this.singleInt2 = singleInt2;
        this.intArray = intArray;
        this.singleChar = singleChar;
    }

    public Iterator<Integer> naturalOrderIterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < 2 + intArray.length;
            }

            @Override
            public Integer next() {
                if (currentIndex == 0) {
                    currentIndex++;
                    return singleInt1;
                } else if (currentIndex == 1) {
                    currentIndex++;
                    return singleInt2;
                } else {
                    return intArray[currentIndex++ - 2];
                }
            }
        };
    }

    public Iterator<Integer> mixedOrderIterator() {
        return new Iterator<>() {
            private int currentIndex = -1;

            @Override
            public boolean hasNext() {
                return currentIndex < intArray.length + 1;
            }

            @Override
            public Integer next() {
                if (currentIndex == -1) {
                    currentIndex++;
                    return (int) singleChar;
                } else if (currentIndex < intArray.length) {
                    return intArray[currentIndex++];
                } else if (currentIndex == intArray.length) {
                    currentIndex++;
                    return singleInt1;
                } else {
                    return singleInt2;
                }
            }
        };
    }

    public Iterator<Integer> oddEvenOrderIterator() {
        return new Iterator<>() {
            private int currentIndex = -3;
            private int arrayIndex = 1;

            @Override
            public boolean hasNext() {
                return currentIndex < intArray.length || arrayIndex < intArray.length;
            }

            @Override
            public Integer next() {
                if (currentIndex == -3) {
                    currentIndex++;
                    return singleInt1;
                } else if (currentIndex == -2) {
                    currentIndex++;
                    return (int) singleChar;
                } else if (currentIndex == -1) {
                    currentIndex++;
                    return singleInt2;
                } else if (arrayIndex < intArray.length) {
                    int value = intArray[arrayIndex];
                    arrayIndex += 2;
                    return value;
                } else {
                    int value = intArray[currentIndex];
                    currentIndex += 2;
                    return value;
                }
            }
        };
    }

    @Override
    public Iterator<Integer> iterator() {
        return naturalOrderIterator();
    }
}
