public class Search {
    

    public boolean LinearSearch(int arr[], int find)
    {
        int index = 0;
        while (arr[index] != find) {
            index++;

            if(arr.length <= index) return false;
        }
        return true;
    }

    public boolean BinarySearch(int arr[], int find)
    {
        int low = 0;
        int high = arr.length - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
    
            if (arr[mid] == find) {
                return true;
            } else if (arr[mid] > find) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    
        return false;
    }
}
