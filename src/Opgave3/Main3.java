package Opgave3;
import java.util.*;


public class Main3 {
    public static void main(String[] args)  {


        Person p1 = new Person("Helle", 173, 45);
        Person p2 = new Person("Kurt", 173, 89);
        Person p3 = new Person("Frede", 150, 45);
        Person p4 = new Person("Morten", 193, 18);
        Person p5 = new Person("Grete", 165, 66);
        Person p6 = new Person("Torben", 187, 48);
        Person p7 = new Person("Ella", 174, 26);
        Person p8 = new Person("Kirsten", 178, 59);

        //Da der ikke står i opgaven, at hvis personerne
        //er lige høje, samt lige gamle, skal der sorteres efter navne, er der ikke gjort dette.

        ArrayList<Person> personer = new ArrayList<Person>(
                Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8)
        );

        Collections.sort(personer);
        System.out.println(personer);


    }


}
