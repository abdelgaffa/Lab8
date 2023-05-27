import java.util.Iterator;

public class DynamicArray {
    private int[] data;
    private int size;

    public DynamicArray() {
        data = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size] = value;
        size++;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int value = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        if (size <= data.length / 4) {
            int[] newData = new int[data.length / 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        return value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        data[index] = value;
    }

    public int getMax() {
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (data[i] > data[maxIndex]) {
                maxIndex = i;
            }
        }
        return data[maxIndex];
    }

    public int getSecondMax() {
        int maxIndex = -1;
        int secondMaxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (maxIndex == -1 || data[i] > data[maxIndex]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (secondMaxIndex == -1 || data[i] > data[secondMaxIndex]) {
                secondMaxIndex = i;
            }
        }
        return data[secondMaxIndex];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int getSize() {
        return size;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                return data[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

