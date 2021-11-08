package com.company;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
//        Field[] declaredFields = Person.class.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            Doc annotation = (Doc) declaredField.getAnnotation(Doc.class);
//            System.out.println("field="+declaredField.getName());
//            System.out.println(annotation.Description()+"\t"+annotation.ReturnType());
//        }
        AnnotationRunner runner = new AnnotationRunner();
        Method[] methods = runner.getClass().getMethods();

        for (Method method : methods) {
            CanRun annos = method.getAnnotation(CanRun.class);
            if (annos != null) {
                try {
                    method.invoke(runner);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Person {

        enum FRIEND {
            FRIEND1,
            FRIEND2
        }

        @Doc(Description = "nameeee", ReturnType = "String")
        String name;
        String lastName;

        @Doc(Description = "myFriend", ReturnType = "enum")

        FRIEND friend;
        int age;
        @Doc(Description = "kg ", ReturnType = "floating")
        float weight;
        float height;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        @Doc(Description = "method getW", ReturnType = "float")
        public float getWeight() {
            return weight;
        }

        public float getHeight() {
            return height;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
