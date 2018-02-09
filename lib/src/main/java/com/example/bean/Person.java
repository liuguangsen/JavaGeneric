package com.example.bean;

/**
 * Created by 1505019 on 2018/2/9.
 */

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        int result;
        if (getAge() > person.getAge()) {
            result = -1;
        } else if (getAge() == person.getAge()) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }
}
