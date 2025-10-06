public class main {

    public static void main(String[] args) {
        

        Search search = new Search();

        // int arr[] = {5, 1, 8, 4, 2, 34};
        // System.out.println(search.LinearSearch(arr, 42));


        int arr[] = {1, 4, 5, 8, 34, 42, 54, 65, 105};
        System.out.println(search.BinarySearch(arr, 2));
    }
}