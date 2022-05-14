
package Section6.Car;

public class Car {
private String name;
private  boolean engine;
private int cylinders;
private int wheels;
public Car(String name,int cylinders)
{
    this.name=name;
    this.engine=true;
    this.cylinders=cylinders;
    this.wheels=4;
}
public String getName()
{
    return this.name;
}
public int getCylinders()
{
    return this.cylinders;
}

public String startEngine()
{
    return getClass().getSimpleName()+"-> startEngine()";
}
public String accelerate()
{
    return getClass().getSimpleName()+"-> accelerate()";
}
public String brake()
{
    return getClass().getSimpleName()+"-> brak()";
}

}
class Ford extends Car
{
    public Ford(String name,int cylinders)
    {
        super(name,cylinders);
    }
    @Override
    public String startEngine()
{
    return getClass().getSimpleName()+"-> startEngine()";
}
    @Override
    public String accelerate()
{
    return getClass().getSimpleName()+"-> accelerate()";
}
    @Override
    public String brake()
{
    return getClass().getSimpleName()+"-> brak()";
}
}
class Mitsubishi extends Car
{
    public Mitsubishi(String name,int cylinders)
    {
      super(name,cylinders);  
    }
    @Override
    public String startEngine()
{
    return getClass().getSimpleName()+"-> startEngine()";
}
    @Override
    public String accelerate()
{
    return getClass().getSimpleName()+"-> accelerate()";
}
    @Override
    public String brake()
{
    return getClass().getSimpleName()+"-> brak()";
}
}
class Holden extends Car
{
    public Holden(String name,int cylinders)
    {
      super(name,cylinders);  
    }
    @Override
    public String startEngine()
{
    return getClass().getSimpleName()+"-> startEngine()";
}
    @Override
    public String accelerate()
{
    return getClass().getSimpleName()+"-> accelerate()";
}
    @Override
    public String brake()
{
    return getClass().getSimpleName()+"-> brak()";
}
}
