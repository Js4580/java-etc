package part_number_two.Enum;

public class Before_Enum {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        System.out.println(animal.getTranslate());
        switch (animal){
            case CAT:
                System.out.println("as");
        }
    }
}
