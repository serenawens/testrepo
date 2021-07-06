package OldLessonStuff;

import java.io.*;
import java.util.*;
public class Unit2MadLibsProject {
    public static void main(String args[])
    {
        Scanner flower= new Scanner(System.in);
        System.out.print("Name a flower(plural): ");
        String flower1 = flower.nextLine();

        Scanner color= new Scanner(System.in);
        System.out.print("Name a color: ");
        String color1= color.nextLine();

        Scanner anotherFlower= new Scanner(System.in);
        System.out.print("Name another flower(plural): ");
        String flower2= anotherFlower.nextLine();

        Scanner anotherColor = new Scanner(System.in);
        System.out.print("Name another color: ");
        String color2= anotherColor.nextLine();

        Scanner aFood= new Scanner(System.in);
        System.out.print("Name a food (plural): ");
        String food= aFood.nextLine();

        Scanner anAdjective = new Scanner(System.in);
        System.out.print("List an adjective: ");
        String adjective= anAdjective.nextLine();

        Scanner aPerson= new Scanner(System.in);
        System.out.print("Name a person: ");
        String name= aPerson.nextLine();

        System.out.println(flower1 + " are "+ color1);
        System.out.println(flower2 + " are "+ color2);
        System.out.println(food + " are " + adjective);
        System.out.println("And so is " + name);

    }
}
