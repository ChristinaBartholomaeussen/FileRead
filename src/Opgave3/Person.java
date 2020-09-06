package Opgave3;

public class Person implements Comparable<Person> {

    private String name;
    private int height;
    private int age;

    public Person(){}

    public Person(String name, int height, int age)
    {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public int getHeight()
    {
        return height;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public int compareTo(Person p)
    {
        if(p.getAge() > this.age)
        {
            return -1;
        }

        else if(p.getAge() == this.age && p.getHeight() > this.height)
        {
            return -1;
        }
        else if(p.getAge() == this.age && p.getHeight() == this.height)
        {
            return 0;
        }
        return 0;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Height: " + height + " Age: " + age + "\n";
    }


}

