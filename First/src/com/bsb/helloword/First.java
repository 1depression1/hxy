/**
 * Copyright (C), 2016-2019, 包银消费金融股份有限公司
 * FileName: First
 * Author:   王郁文
 * Date:     2019/9/16 14:49
 * Description: 第一个Demo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bsb.helloword;

/**
 * @author 王郁文
 * @date 2019/9/16 14:49
 */
public class First {

    private Integer age;

    @Override
    public String toString() {
        return "First{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public Integer getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        System.out.print("demo");
    }

    /**
     *
     * @param age
     * @param name
     * @return
     */
    public static  Integer test(Integer age,String name){
        return age;
    }

}
