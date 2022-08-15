package part_number_two.Enum;

public enum Animal {
     DOG("собака") ,CAT("кошка"),FROG("лягушка");
     private final String translate;

     Animal(String translate){
          this.translate = translate;
     }

     public String getTranslate() {
          return translate;
     }

     @Override
     public String toString() {
          return "Animal{" +
                  "translate='" + translate + '\'' +
                  '}';
     }


}