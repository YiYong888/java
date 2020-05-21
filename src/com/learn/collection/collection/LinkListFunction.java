package com.learn.collection.collection;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: YiYong
 * Date: 2020/5/17
 * Time: 17:53
 * Description:pop、peek方法是LinkList独属的
 */
public class LinkListFunction {

    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");

        //LinkList中pop会移除项顶元素
       // linkedList.pop();
        String peek = linkedList.peek();
        System.out.println(peek);
        for(String str:linkedList){
            System.out.println(str);
        }




    }
}
