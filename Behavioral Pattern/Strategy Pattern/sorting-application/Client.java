// a sorting application where we need to sort a list of integers. However, the sorting algorithm to be used may vary depending on factors such as the size of the list and the desired performance characteristics.

// SortingContext.java
class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}

// SortingStrategy.java
interface SortingStrategy {
    void sort(int[] array);
}

// BubbleSortStrategy.java
class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Bubble Sort");
    }
}

// MergeSortStrategy.java
class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Merge Sort");
    }
}

// QuickSortStrategy.java
class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Quick Sort");
    }
}

// Client.java
public class Client {
    public static void main(String[] args) {
        // Create SortingContext with BubbleSortStrategy
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1);

        // Change strategy to MergeSortStrategy
        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext.performSort(array2);

        // Change strategy to QuickSortStrategy
        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array3 = {6, 1, 3, 9, 5};
        sortingContext.performSort(array3);
    }
}