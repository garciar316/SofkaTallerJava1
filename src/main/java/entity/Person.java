package entity;

import util.Constants;
import util.Operations;
import util.Words;

public class Person {

    private String name;
    private String dni;
    private Character sex;
    private Double weight;
    private Double height;
    private Integer age;

    public Person() {
        this.name = "";
        this.sex = 'M';
        this.age = 0;
        this.height = 0.0;
        this.weight = 0.0;
        generateDNI();
    }

    public Person(String name, Character sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = 0.0;
        this.weight = 0.0;
        generateDNI();
    }

    public Person(String name, Character sex, Double weight, Double height, Integer age) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.age = age;
        generateDNI();
    }

    public Integer calculateIMC(Integer weight, Integer height) {
        double imc = weight/(Math.pow(height, 2));
        if (imc < 20) {
            return Constants.IMC_OK;
        }
        if (imc >= 20 && imc <= 25) {
            return Constants.IMC_UNDER;
        }
        if (imc > 25) {
            return Constants.IMC_ABOVE;
        }
        return null;
    }

    public boolean isOlder(Integer age) {
        return age >= 18;
    }

    public void validateSex(String sex) {
        switch (sex) {
            case "F":
                this.sex = 'F';
                break;
            case "M":
            default:
                this.sex = 'M';
                break;
        }
    }

    private void generateDNI() {
        Integer number = Operations.generateRandomNumber();
        String letter = Words.calculateLetter(number);
        this.dni = number + letter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
