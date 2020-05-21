package com.learn.lambda.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: YiYong
 * Date: 2020/5/19
 * Time: 22:04
 * Description: No Description
 */
public class CreateStream {

    public static void main(String[] args) {

        /**
         * 对集合使用stream
         */
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        System.out.println(stream);

        /**
         *
         */





    }
}
