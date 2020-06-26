package ru.nergal.selferules;

public class TestPerson {
    private final int age;
    private final String name;

    public TestPerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer age() {
        return age;
    }

    public String name() {
        return name;
    }
}
