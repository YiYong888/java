package com.learn.collection.map;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: YiYong
 * Date: 2020/5/6
 * Time: 23:06
 * Description: No Description
 */
public class Person  implements Comparable {

    String name;
    int age;

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
    public int compareTo(Object o) {
        Person p = (Person)o;
        return  this.age-p.getAge();
    }
}
