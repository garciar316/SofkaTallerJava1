package exercises;

import entity.Person;

import java.util.Scanner;

public class Exercise16 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        Character sex;
        Integer age;
        Double height;
        Double weight;

        System.out.print("Ingrese el nombre: ");
        name = sc.nextLine();
        System.out.print("Ingrese el sexo: ");
        sex = sc.nextLine().charAt(0);
        System.out.print("Ingrese la edad: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la altura: ");
        height = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el peso: ");
        weight = Double.parseDouble(sc.nextLine());

        Person person1 = new Person(name, sex, weight, height, age);
        Person person2 = new Person(name, sex, age);
        Person person3 = new Person();

        person3.setName(name);
        person3.setSex(sex);
        person3.setWeight(weight);
        person3.setHeight(height);
        person3.setAge(age);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
