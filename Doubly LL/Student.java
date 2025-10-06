import javax.print.attribute.standard.MediaSize.NA;

public class Student {
    Student(int id, String Name, double GPA)
    {
        this.id = id;
        this.Name = Name;
        this.GPA = GPA;
    }

    int id;
    String Name;
    double GPA;

    public int getId()
    {
        return id;
    }

    public String getFullName()
    {
        return Name;
    }

    public double getGPA()
    {
        return GPA;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setFullName(String Name)
    {
        this.Name = Name;
    }

    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }

    public String toString()
    {
        return "ID: " + id + " Name: " + Name + " GPA: " + GPA;
    }
}
