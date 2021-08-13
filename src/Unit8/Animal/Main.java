package Unit8.Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("мясо","улица","black");
        Animal[] animals = {dog, new Cat("рыба","дом",9),new Horse("овёс","ферма",60)};
        Veterinarian veterinarian = new Veterinarian();
        for (int i = 0; i < animals.length; i++) {
            veterinarian.treatAnimal(animals[i]);
        }
    }
}
