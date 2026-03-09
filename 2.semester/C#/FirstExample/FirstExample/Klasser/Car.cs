namespace FirstExample.Klasser;

public class Car
{
    private string name;
    private int cylinders;

    public Car(string name, int cylinders)
    {
        this.name = name;
        this.cylinders = cylinders;
    }
    
    public string Name
    {
        get { return name; }
        set { name = value; }
    }
    
    public int Cylinders 
    {
        get { return cylinders; }
        set { cylinders = value; }
    }
    
    public override string ToString()
    {
        return $"[Car: Name = {name}, Cylinders = {cylinders}]";
    }
}