
public class main {
    public static void main(String[] args) {
      OrderedLL orderedLL = new OrderedLL();

        Student student1 = new Student(1, "Taner", 3.8);
        Student student2 = new Student(6, "Ali", 2.5);
        Student student3 = new Student(3, "Ayse", 3.2);
        Student student4 = new Student(3, "Joe", 2.9);

        //IsEmpty
        System.out.println("Is it empty: " + orderedLL.IsEmpty());

        //Insert
        orderedLL.Insert(student1);
        orderedLL.Insert(student2);
        orderedLL.Insert(student3);
        
        //OutputList
        orderedLL.OutputList();
        //Size
        System.out.println("The size is: " + orderedLL.GetSize());
        //Search
        System.out.println(orderedLL.Search(student4));
    }
  }
  