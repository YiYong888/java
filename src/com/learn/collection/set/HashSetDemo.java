package com.learn.collection.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: YiYong
 * Date: 2020/5/6
 * Time: 23:59
 * Description: No Description
 */
public class HashSetDemo {
    public static void main(String[] args) {
        test2();
    }

    public static void test1(){
        HashSet set = new HashSet();
        set.add("s1");
        set.add("s2");
        set.add("s1");

        Iterator its = set.iterator();
        while (its.hasNext()) {
            Object obj = its.next();
            System.out.println(obj);
        }
    }

    public static void test2(){
        HashSet set = new HashSet();
        set.add(new Student("肖永乾", 17));
        set.add(new Student("胡松", 16));
        set.add(new Student("肖永乾", 17));

        Iterator its = set.iterator();
        while (its.hasNext()) {
            Object obj = its.next();
            System.out.println(obj);
        }
    }
}
