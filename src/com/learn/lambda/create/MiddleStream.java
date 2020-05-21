package com.learn.lambda.create;

import com.learn.lambda.create.pojo.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: YiYong
 * Date: 2020/5/19
 * Time: 22:09
 * Description:Stream表达式的中间操作
 */
public class MiddleStream {

    public static void main(String[] args) {
        /**
         *  帅选与切片
         */
        //filter(Predicate p)  就是过滤出年龄大于20岁的员工
        List<Employee> emps = Arrays.asList(
            new Employee(101, "张三", 28, 9999),
            new Employee(102, "李四", 49, 666),
            new Employee(103, "王五", 38, 333),
            new Employee(104, "赵六", 12, 7777),
            new Employee(105, "田七", 6, 222)
        );
        //   emps.stream().filter((e)->e.getAge()>20).forEach(System.out::println);


        //对集合中的元素进行去重操作
        List<Employee> employees = Arrays.asList(
            new Employee(101, "张三", 28, 9999),
            new Employee(101, "张三", 28, 9999),
            new Employee(103, "王五", 38, 333),
            new Employee(104, "赵六", 12, 7777),
            new Employee(104, "赵六", 12, 7777)
        );

//        List<Employee> collect = employees.stream().distinct().collect(Collectors.toList());
//        for (Employee employee:collect){
//            System.out.println(employee);
//        }

        //使用Stream表达式对集合进行限制
        List<Employee> collect = employees.stream().limit(1).collect(Collectors.toList());
//        for (Employee employee:collect){
//            System.out.println(employee);
//        }


        //使用Stream表达式进行跳跳
//        List<Employee> collect1 = employees.stream().skip(3).collect(Collectors.toList());
//        for (Employee employee:collect1){
//            System.out.println(employee);
//        }



        /**
         *
         * 映射
         *
         * map(Function f) 接收 Lambda ， 将元素转换成其他形式或提取信息;接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
         * mapToDouble(ToDoubleFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 DoubleStream。
         * mapToInt(ToIntFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 IntStream。
         * mapToLong(ToLongFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 LongStream。
         * flatMap(Function f) 接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。 《----------稍后再学习----------》
         *
         */

        // map（Function f）的使用
//       List<String> strings = Arrays.asList("张三", "李四", "王五", "赵六", "田七");
//       List<String> letter = Arrays.asList("a", "v", "d", "g", "g");
//       strings.stream().map(String::toCharArray).forEach(System.out::println);
//        letter.stream().map(String::toUpperCase).forEach(System.out::println);

        //flatMap(Funtion f)

        //mapToDouble的使用
//        List<Double> doubleList=new ArrayList<>();
//        doubleList.add(1D);
//        doubleList.add(2D);
//        doubleList.add(5D);
//        doubleList.stream().mapToInt((d)-> (int) (d*2.0)).forEach(System.out::println);



        /**
         * sorted() 产生一个新流，其中按自然顺序排序
         * sorted(Comparator comp) 产生一个新流，其中按比较器顺序排序
         *
         *
         *
         *
         */
        List<Employee> employeesSort = Arrays.asList(
            new Employee(101, "张三", 12, 9999),
            new Employee(102, "李四", 49, 666),
            new Employee(103, "王五", 38, 333),
            new Employee(104, "赵六", 12, 7777),
            new Employee(105, "田七", 6, 222)
        );


        //-------------------------sorted------------------
        //错误示例，有头没尾巴，相当于没写--------不会做任何操作
//        List<Integer> ages = new ArrayList<>();
//        employeesSort.stream().map(employee -> {
//            ages.add(employee.getAge());
//            return employee.getName();
//        }).sorted();
//
//        for (Integer age : ages) {
//            System.out.println(age);
//        }

        //正确的进行结束，能进行输出 ---------注意此时并未按原来的顺序进行输出
//        List<Integer> ages2 = new ArrayList<>();
//        employeesSort.stream().map(employee -> {
//            ages2.add(employee.getAge());
//            return employee.getName();
//        }).sorted().forEach(System.out::println);
//
//        for (Integer age : ages2) {
//           // System.out.println(age);
//        }

        //------------------------------ sorted(Comparator comp) 产生一个新流，其中按比较器顺序排序-----------
        employeesSort.stream().sorted((p1,p2)->{
           if (p1.getAge().equals(p2.getAge())){
                return p1.getName().compareTo(p2.getName());
           }else{
               return  Integer.compare(p1.getAge(),p2.getAge());
           }
        }).forEach(System.out::println);



        List<Employee> employeesTest = Arrays.asList(
            new Employee(101, "张三", 12, 9999),
            new Employee(102, "李四", 49, 666),
            new Employee(103, "王五", 38, 333),
            new Employee(104, "赵六", 12, 7777),
            new Employee(105, "田七", 6, 222)
        );

        /********************查找与匹配、归约、收集**********************/
        /***
         *
         * allMatch——检查是否匹配所有元素
         * anyMatch——检查是否至少匹配一个元素
         * noneMatch——检查是否没有匹配的元素
         * findFirst——返回第一个元素
         * findAny——返回当前流中的任意元素
         * count——返回流中元素的总个数
         * max——返回流中最大值
         * min——返回流中最小值
         */

      //












    }


}
