/**
 * Created by JerellDR on 12/7/2014.
 * On 12/7/2014
 */
public class InsertionSortMain {

    public static void main(String [] args) {
        String[] toSort = {"i","n","s","e","r","t","i","o","n","s","o","r","t"};

        StringWrapper sortObject = new StringWrapper();

        sortObject.toSort = toSort;

        System.out.println("Unsorted List: " + sortObject);

        doSort(sortObject, toSort.length);

        System.out.println("Sorted List: " + sortObject);
        //
        String[] toReverseSort = {"i","n","s","e","r","t","i","o","n","s","o","r","t"};

        StringWrapper reverseSortObject = new StringWrapper();

        reverseSortObject.toSort = toReverseSort;

        System.out.println("Unsorted List: " + reverseSortObject);

        doReverseSort(reverseSortObject, toSort.length);

        System.out.println("Sorted List: " + reverseSortObject);
    }



    public static void doSort(StringWrapper sortObject, int n) {
        int i, j;

        for (i = 1; i < n; i++) {
            j = i;
            while((j > 0) && (sortObject.toSort[j].compareTo(sortObject.toSort[j-1]) < 0)){
              swap(sortObject.toSort, j, j-1);
                j = j-1;
            }
        }
    }
    public static void doReverseSort(StringWrapper sortObject, int n) {
        int i, j;
        for (i = 1; i < n; i++) {
            j = i;
            while((j > 0) && (sortObject.toSort[j].compareTo(sortObject.toSort[j-1])> 0)){
                swap(sortObject.toSort, j, j-1);
                j = j-1;
            }
        }
    }

    private static void swap(String[] swapArray, int first, int second) {
        System.out.print("swap: " + swapArray[first] + " with :" + swapArray[second] + "\n");
        String temp = swapArray[second];
        swapArray[second] = swapArray[first];
        swapArray[first] = temp;
        temp = null;
    }
}
