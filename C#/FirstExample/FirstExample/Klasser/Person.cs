namespace FirstExample.Klasser;

public class Person
{
    private String name;
    private String adress;
    private int age;

    public Person(String name, String adress, int age)
    {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public String Name
    {
        get { return name; }
        set { name = value; }
    }

 
    public override string ToString()
    {
        return $"[Person: name={name}, adress={adress}, age={age}";
    }
}