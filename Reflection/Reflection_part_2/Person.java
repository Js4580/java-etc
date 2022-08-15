package part_number_two.£part.Reflection.Reflection_part_2;

import part_number_two.£part.Reflection.Reflection_part_1.Author;

@Author(name = " Nazar", dateOfCreate = 2022)
public class Person {
    private int id;
    private String name;

    public Person() {
        this.id = 1;
        this.name = "No name";
    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Person with id: " + id + " and name: " + name + " says hello!😉");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

