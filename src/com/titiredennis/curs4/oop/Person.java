package com.titiredennis.curs4.oop;

public class Person {
    private String name;
    private int age;
    private char sex;
    private int birthYear;
    private int height;
    private String cnp;

    private Person(String name, int age, char sex, int birthYear, int height, String cnp) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthYear = birthYear;
        this.height = height;
        this.cnp = cnp;
    }

    public Person(String nume, String cnp) {
        this(nume, 60, 'M', 1960, 160, cnp);
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getCnp() {
        return cnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String toString() {
        return "Sunt o persoana cu numele " + name + ". Am varsta de " + age + " de ani. Am cnp-ul " + cnp + ".";
    }
}


// STATE -> nume, varsta, sex, anNastere, inaltime

// BEHAVIOUR -> plimbe, manance, munceasca, invete, ........


// METODE
// <<tip-ul returnat>> <<nume>>(<<parametrii>>) { return ceva;}

    /*
    METODE
    void -> nu returneaza nimic. Side effect -> System.out.println();
    returneaza ceva -> String, int
     */
