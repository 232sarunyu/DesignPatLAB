public class SortProcessor {
    public static void main(String[] args) {
        sortALG MS = new MergeSort();
        sortALG IS = new InsertionSort();
        sortALG SS = new SelectionSort();

        MS.sort();
        IS.sort();
        SS.sort();

    }
}
