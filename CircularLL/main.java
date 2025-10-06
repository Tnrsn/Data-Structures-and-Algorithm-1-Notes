
public class main {
    public static void main(String[] args) {
      
      CircularLL circularLL = new CircularLL();

      Student student1 = new Student(1, "Taner", 3.8);
      Student student2 = new Student(2, "Ali", 2.5);
      Student student3 = new Student(3, "Ayse", 2.9);
      Student student4 = new Student(4, "Joe", 3.2);
      Student student5 = new Student(5, "Jane", 3.5);
    
    
      circularLL.addStudent(student1);
      circularLL.addStudent(student2);
      circularLL.addStudent(student3);
      circularLL.addStudent(student4);
      circularLL.addStudent(student5);

      circularLL.OutputList();

    }
  }
  