//OOPS __ Object Orieted Programming

//Classes and Object*****************************************************************************************

/* 
import java.util.*;

public class Day13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter specifications of the Pen :");
        System.out.print("Set the color : ");
        String c = sc.next();
        System.out.println();
        System.out.print("Set the size of the tip");
        int t = sc.nextInt();

        Pen pen1 = new Pen();

        pen1.setColor(c);

        System.out.println("color alloted to the Pen is " + pen1.color);

        pen1.setTip(t);

        System.out.println("tip of the pen is " + pen1.tip);

        // Access / Modifier
        BankAccount myAcc = new BankAccount();

        System.out.println("Account Holder is requested to Set user name");
        myAcc.username = sc.next();
        System.out.println("Account number is : ");
        myAcc.Acc_no = sc.nextInt();
        String pwd = sc.next();
        System.out.println(myAcc.setPassword(pwd));
        System.out.println(
                "details of the acc holder : " + myAcc.username + " acc no : " + myAcc.Acc_no);

    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newcolor) { // we can use String newcolor as an argument also
        color = newcolor;
        // color = newcolor
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {
    public String username;
    public int Acc_no;
    private String password;

    public void setPassword(String newPassword) {
        password = newPassword;
    }
}
*/

// Getters and Setters

/*
 * 
 * import java.util.*;
 * 
 * public class Day13 {
 * public static void main(String[] args) {
 * // Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Let's make shirt for you -->");
 * shirt S1 = new shirt();
 * 
 * S1.setColor("Red");
 * System.out.println(S1.getColor());
 * S1.setSize(35);
 * System.out.println(S1.getSize());
 * 
 * /*
 * int s[] = 5;
 * for (int i = 0; i < s.length; i++) {
 * s[i] = sc.nextInt();
 * S1.setSize(s[i]);
 * }
 * 
 * Sting c[] = 5;
 * for (int i = 0; i < c.length; i++) {
 * c[i] = sc.next();
 * S1.setColor(c[i]);
 * }
 * 
 * System.out.println("printing the details of shirts ");
 * 
 * for (int i = 0; i < num; i++) {
 * 
 * System.out.println(S1.getSize(i));
 * System.out.println(S1.getColor(i));
 * 
 * }
 * /
 * 
 * }
 * }
 * 
 * class shirt {
 * 
 * int size;
 * String color;
 * 
 * int getSize(int size) {
 * return size;
 * }
 * 
 * String getColor(String color) {
 * return color;
 * }
 * 
 * void setSize(int size) {
 * this.size = size;
 * }
 * 
 * void setColor(String color) {
 * this.color = color;
 * }
 * 
 * }
 * 
 * 
 */

// Copy
// Constructor************************************************************************************************

/*
 * 
 * import java.util.*;
 * 
 * public class Day13 {
 * public static void main(String[] args) {
 * 
 * Student S0 = new Student();
 * 
 * S0.name = "mahak";
 * S0.roll = 32;
 * S0.password = "mnb";
 * 
 * S0.marks[0] = 100;
 * S0.marks[1] = 90;
 * S0.marks[2] = 80;
 * 
 * Student S2 = new Student(S0);
 * S2.password = "xyz";
 * 
 * for (int i = 0; i < 3; i++) {
 * System.out.println(S2.marks[i]);
 * }
 * 
 * }
 * }
 * 
 * class Student {
 * String name;
 * int roll;
 * String password;
 * int marks[];
 * 
 * // copy constructor or Shallow copy constructor
 * 
 * Student(Student S0) {
 * marks = new int[3];
 * this.name = S0.name;
 * this.roll = S0.roll;
 * this.marks = S0.marks;
 * }
 * 
 * Student() {
 * System.out.println("*******Constructor is called********");
 * 
 * }
 * 
 * Student(String name) {
 * 
 * this.name = S0.name;
 * }
 * 
 * Student(int roll) {
 * 
 * this.roll = S0.roll;
 * }
 * 
 * }
 * 
 */

// Inheritance************************************************************

/*
 * import java.util.*;
 * 
 * public class Day13 {
 * public static void main(String[] args) {
 * 
 * Fish shark = new Fish();
 * shark.eat();
 * shark.swim();
 * 
 * Dog dobby = new Dog();
 * dobby.eat();
 * dobby.breed = "guffy";
 * System.out.println(dobby.breed);
 * dobby.legs = 4;
 * 
 * Peacock peo = new Peacock();
 * peo.eat();
 * peo.feather = 99;
 * System.out.println("the number of feather is " + peo.feather);
 * peo.national();
 * 
 * }
 * }
 * 
 * // base class
 * class Animal {
 * 
 * void eat() {
 * System.out.println("eats");
 * }
 * 
 * void breathe() {
 * System.out.println("breathe");
 * }
 * }
 * 
 * // derived class
 * 
 * class Fish extends Animal {
 * 
 * int fins;
 * 
 * void swim() {
 * System.out.println("Swims");
 * }
 * }
 * 
 * class Tuna extends Fish {
 * int weight;
 * }
 * 
 * class Shark extends Fish {
 * int size;
 * }
 * 
 * // derived class
 * 
 * class Mammal extends Animal {
 * int legs;
 * }
 * 
 * class Dog extends Mammal {
 * String breed;
 * }
 * 
 * class Cat extends Mammal {
 * String color;
 * }
 * 
 * class Human extends Mammal {
 * String greeting;
 * }
 * 
 * class Birds extends Animal {
 * int feather;
 * }
 * 
 * class Peacock extends Birds {
 * void national() {
 * System.out.println("It is the National bird!");
 * }
 * }
 * 
 * 
 */

// Polymorphism **************************************************************

// Compile time Polymorphism (Method Overloading)

/*
 * import java.util.*;
 * 
 * public class Day13 {
 * public static void main(String[] args) {
 * 
 * Calculator calci = new Calculator();
 * System.out.println(calci.sum(1, 2));
 * System.out.println(calci.sum((float) 1.5, (float) 2.5));
 * System.out.println(calci.sum(1, 2, 3));
 * }
 * }
 * 
 * class Calculator {
 * int sum(int a, int b) {
 * return a + b;
 * }
 * 
 * float sum(float a, float b) {
 * return a + b;
 * }
 * 
 * int sum(int a, int b, int c) {
 * return a + b + c;
 * }
 * 
 * }
 * 
 */

// Run time Polymorphism (Method OverRiding)

/*
 * import java.util.*;
 * 
 * public class Day13 {
 * public static void main(String[] args) {
 * 
 * Deer d = new Deer();
 * d.eat();
 * }
 * }
 * 
 * class Animal {
 * void eat() {
 * System.out.println("Eats everything!");
 * }
 * }
 * 
 * class Deer extends Animal {
 * void eat() {
 * System.out.println("Eats Grass!");
 * }
 * }
 * 
 */

// Abstraction****************************************************************

// abstract class

/*
import java.util.*;


public class Day13 {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal's constructor is called");
    }

    void eat() {
        System.out.println("animal eats!");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse's constructor is called");
    }

    void walk() {
        System.out.println("Walk on 4 legs!");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println(" Mustang is called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walk on 2 legs!");
    }
}


*/

//Interface*9************************************************************************************
// Example 1

/* 
import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Pawn p = new Pawn();
        p.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down , Right , Left , Diagonal(in 4 dirtn) ");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up , Down , Right , Left , Diagonal( for 1 move) ");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up , Down , Right , Left ");
    }
}

class Bishop implements ChessPlayer {
    public void moves() {
        System.out.println("Digonal(in 4 dirtn)");
    }
}

class Knight implements ChessPlayer {
    public void moves() {
        System.out.println("moves in an L Shape ");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println("Up , Right , Left (Only 1 move)");
    }
}

*/

//Example 2 

/* 
import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Bears brownB = new Bears();
        brownB.eats();
        brownB.legs();

    }
}

interface Harbivores {
    void eats();
}

interface Carnivores {
    void legs();
}

class Bears implements Harbivores, Carnivores {
    public void eats() {
        System.out.println("Bears eats grass! ");
    }

    public void legs() {
        System.out.println("Bears has 2 legs ! ");
    }

}

*/

//Static Keyword

import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ABC";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        s2.schoolName = ""
        System.out.println(s2.schoolName);


    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    void getName() {
        this.name = name;
    }
}