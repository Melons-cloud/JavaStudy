package com.hjl.day01;

public class PersonCase {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.setAge(20);
        person.name="赵丽颖";

        person.show();  //如果输入的数据不合理，则显示默认值
    }

}
