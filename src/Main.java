public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        // Add elements
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);

        System.out.println("Size of dynamic array: " + dynamicArray.getSize());

        // Get element by index
        System.out.println("Element at index 2: " + dynamicArray.get(2));

        // Set element by index
        dynamicArray.set(2, 25);
        System.out.println("Element at index 2 after modification: " + dynamicArray.get(2));

        // Print max element
        System.out.println("Max element: " + dynamicArray.getMax());

        // Remove element
        dynamicArray.remove(2);
        System.out.println("Size of dynamic array after removal: " + dynamicArray.getSize());

        // Print max and second max after removal
        System.out.println("Max element after removal: " + dynamicArray.getMax());
        System.out.println("Second max element after removal: " + dynamicArray.getSecondMax());

        for (int value : dynamicArray) {
            System.out.println(value);
        }
    }
}

