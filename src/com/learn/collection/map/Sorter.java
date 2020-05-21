package com.learn.collection.map;

import java.util.Comparator;



/**
 * 定义一个排序器，用于对集合进行排序操作
 * @author YiYong
 */
public class Sorter implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Person && o2 instanceof Person) {
           return  ((Person) o1).getAge()-((Person) o2).getAge();
        }
        return 0;
    }
}
