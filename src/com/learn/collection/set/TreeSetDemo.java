package com.learn.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: YiYong
 * Date: 2020/5/7
 * Time: 0:02
 * Description: No Description
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();

		/*set.add("s3");
		set.add("s2"); */

        set.add(new Person("肖永乾", 17));
        set.add(new Person("胡松", 16));
        set.add(new Person("肖永乾", 17));

        Iterator its = set.iterator();
        while (its.hasNext()) {
            Object obj = its.next();
            System.out.println(obj);
        }
    }
}
