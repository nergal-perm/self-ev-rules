package ru.nergal.selferules;

/**
 * @todo #3 10m Add Javadoc to TestPerson (see Qulice report for details)
 */

public class TestPerson {
    /**
     * @todo #3 20m Fix Checkstyle & PMD warnings in TestPerson
     */
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
