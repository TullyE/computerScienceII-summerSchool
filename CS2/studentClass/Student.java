public class Student
{
    //define class variables <<up here>>
    private String name;
    private int age;

    // default constructor
    //no parameters
    public Student()
    {
        this.name = "";
        this.age = 0;
    }
    
    //you can have as many constructors as you would like
    public Student(String _name, int _age)
    {
        this.name = _name;
        this.age = _age;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int _age)
    {
        this.age = _age;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String _name)
    {
        this.name = _name;
    }

    public void incrAge()
    {
        this.age += 1;
    }

    //in the string include any class variables that would be req1uired to reconstruct the object from scratch
    public String toString()
    {
        return "\n" + this.name + ":\nAge " + this.age;
    }

    public static void main(String[] args)
    {
        Student a = new Student(); // current name stored in Student a is ""
        Student b = new Student("Lulu", 14);
        Student c = new Student("Elaine", 24);
        a.setName("Tully"); // current name stored in Studen a is "Tully"
        a.incrAge(); // current age is now 1
        a.incrAge(); // current age is now 2
        b.setName("Lauren"); // started as "Lulu" but now is "Lauren
        b.setAge(93); // started as 14 but now is 93
        int ageOfA = a.getAge();
        int ageOfB = b.getAge();
        String nameOfC = c.getName();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}