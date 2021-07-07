public class TestRunner
{
    public static void doSomething()
    {
        System.out.println("I am doing something");
    }
    public static void main(String[] args)
    {
        // Class methods vs. static methods
        //static methods are most generically called with class name . method name
        TestRunner.doSomething();
        Student a = new Student(); // current name stored in Student a is ""
        Student b = new Student("Lulu", 14);
        Student c = new Student("Elaine", 24);
        a.setName("Tully"); // current name stored in Studen a is "Tully"
        a.incrAge(); // current age is now 1
        a.incrAge(); // current age is now 2
        b.setName("Lauren"); // started as "Lulu" but now is "Lauren"
        b.setAge(93); // started as 14 but now is 93
        int ageOfA = a.getAge();
        int ageOfB = b.getAge();
        String nameOfC = c.getName();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
