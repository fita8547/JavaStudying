package poly2;

import poly1.Cat;
import poly1.Caw;
import poly1.Dog;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw cow = new Caw();
        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");
        cat.sound();
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.printf("동물 소리 테스트 종료");
    }
}
