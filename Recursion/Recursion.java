public class Recursion {
    

    public Recursion()
    {

    }


    public int NToOne(int value)
    {
        if(value == 1) return 1;

        return value * NToOne(value - 1);
    }

    public int OneToN(int value, int current)
    {
        if(current > value) return 1;

        return current * OneToN(value, current + 1);
    }

    public int SumofArray(int[] arr, int sum, int index)
    {
        if(arr.length <= index) return sum;

        sum = arr[index] + sum;
        return SumofArray(arr, sum, index + 1);
    }
}
