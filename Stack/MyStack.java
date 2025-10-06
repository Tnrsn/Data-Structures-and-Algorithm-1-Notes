public class MyStack {
    int size = -1;
    int top = -1;
    char[] chArray;

    public MyStack(int size)
    {
        this.chArray = new char[size];
        this.size = size - 1;
    }

    public boolean isEmpty()
    {
        if(top == -1) return true; //true means Its empty

        return false;
    }

    public boolean push(char value)
    {
        top++;

        if(top > size)
        {
            top--;
            return false;
        }

        chArray[top] = value;
        return true;
    }

    public char pop()
    {
        top--;
        return chArray[top + 1];
    }

    public char top()
    {
        return chArray[top];
    }

    public boolean isFull()
    {
        if(top == size) return true; //True means its full

        return false;
    }
}
