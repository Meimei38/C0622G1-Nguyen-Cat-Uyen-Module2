package ss7_abstract_class_interface.thuc_hanh.animal_edible.controller;

import ss7_abstract_class_interface.thuc_hanh.animal_edible.model.animal.Animal;
import ss7_abstract_class_interface.thuc_hanh.animal_edible.model.animal.Chicken;
import ss7_abstract_class_interface.thuc_hanh.animal_edible.model.fruit.Edible;
import ss7_abstract_class_interface.thuc_hanh.animal_edible.model.animal.Tiger;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}

