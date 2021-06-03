package com.zch.aounhuipractice.practice;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合.stream() 创建一个聚合操作
 * 对聚合操作的使用可以归结为3个部分：
 *
 *
 * list.stream()
 *     .filter(student -> student.getSex().equals("G"))
 *     .forEach(student -> System.out.println(student.toString()));
 *
 * 创建Stream:通过stream()方法，取得集合对象的数据集。
 * Intermediate:通过一系列中间（Intermediate）方法，对数据集进行过滤、检索等数据集的再次处理。如上例中，使用filter()方法来对数据集进行过滤。
 * Terminal通过最终（terminal）方法完成对数据集中元素的处理。如上例中，使用forEach()完成对过滤后元素的打印。
 *
 * 在一次聚合操作中，可以有多个Intermediate，但是有且只有一个Terminal。
 * 也就是说，在对一个Stream可以进行多次转换操作，并不是每次都对Stream的每个元素执行转换。
 * 并不像for循环中，循环N次，其时间复杂度就是N。转换操作是lazy(惰性求值)的，只有在Terminal操作执行时，才会一次性执行。
 * 可以这么认为，Stream 里有个操作函数的集合，每次转换操作就是把转换函数放入这个集合中，
 * 在 Terminal 操作的时候循环 Stream 对应的集合，然后对每个元素执行所有的函数。
 *
 * 其中，每个过程中都是用到Lambda的表达式，例如下面的student，student就是list中的其中一个元素，具体就是操作就是对其进行操作。
 */
public class StreamPractice {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("小明", 12, "三年级一班"));
        list.add(new Student("小红", 12, "三年级二班"));
        list.add(new Student("小花", 13, "三年级一班"));
        list.add(new Student("小草", 14, "三年级三班"));
        list.add(new Student("小牛", 14, "三年级二班"));
        list.stream().filter(student -> student.getAge() == 12).forEach(student -> System.out.println(student));
        System.out.println("=======");
        list.stream().filter(student -> student.getClassRoom().equals("三年级二班")).forEach(student -> System.out.println(student));
        System.out.println("=======");
        list.stream().filter(student -> student.getName().equals("小明")).forEach(student -> System.out.println(student));

        //全部匹配
        System.out.println(list.stream().allMatch(student -> student.getAge() >= 12));
        //任意匹配
        System.out.println(list.stream().anyMatch(student -> student.getAge() <= 12));
        //任意查找
        System.out.println(list.stream().findAny());


    }


}

@Data
class Student{
    public String name;
    public int age;
    public String classRoom;
    public Student(String name, int age, String classRoom){
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
    }
}