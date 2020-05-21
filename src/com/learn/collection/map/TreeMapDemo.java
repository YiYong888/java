package com.learn.collection.map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: YiYong
 * Date: 2020/5/6
 * Time: 23:03
 * Description: No Description
 */
public class TreeMapDemo {

    /**
     * 对集合进行排序有两种方式
     * 第一种：key实现 Comparable接口，并重写compareTo方法
     * 第二种：定义一个排序器实现Comparator接口 并重写compareTo方法
     * @param args
     */
    public static void main(String[] args) {
        test5();

    }

    public static void test1(){
        TreeMap map = new TreeMap();
        map.put("hello", "aaa");
        map.put("happy", "cccc");
        map.put("s1", "bbbb");
        Set set = map.keySet();
        Iterator its = set.iterator();
        while(its.hasNext()) {
            Object key = its.next();
            Object value = map.get(key);
            System.out.println(key + ", " + value);
        }
    }

    public static void test2(){
        /**
         * TreeMap的件放字符串，最好不要放
         */
        TreeMap map = new TreeMap();
        map.put( "aaa",new Person("s3", 10));
        map.put( "cccc",new Person("s8", 18));
        map.put("bbbb",new Person("s1", 14));
        map.put("dddd",new Person("s1", 14));
//		map.put(null, "dddd");

        Set set = map.keySet();
        Iterator its = set.iterator();
        while(its.hasNext()) {
            Object key = its.next();
            Object value = map.get(key);
            System.out.println(key + ", " + value);
        }
    }

    public static void test3(){
        TreeMap map = new TreeMap();
        map.put(new Person("s3", 10), "aaa");
        map.put(new Person("s8", 18), "cccc");
        map.put(new Person("s1", 14), "bbbb");
        map.put(new Person("s1", 14), "dddd");
//		map.put(null, "dddd");

        Set set = map.keySet();
        Iterator its = set.iterator();
        while(its.hasNext()) {
            Object key = its.next();
            Object value = map.get(key);
            System.out.println(key + ", " + value);
        }
    }


    public static void test5(){
        Sorter sorter = new Sorter();
        TreeMap map = new TreeMap(sorter);
        map.put(new Person("s3", 10), "aaaa");
        map.put(new Person("s8", 18), "cccc");
        map.put(new Person("s1", 14), "bbbb");
        map.put(new Person("s1", 14), "dddd");

        Set set = map.keySet();
        Iterator its = set.iterator();
        while(its.hasNext()) {
            Object key = its.next();
            Object value = map.get(key);
            System.out.println(key + ", " + value);
        }
    }



}
