package test;

import animal.*;

public class AnimalTest01 {
	public static void main(String[] args) {
		Animal[] animals = {
				new Dog("���", "ġ�Ϳ�"),
				new Cat("����", 5),
				new Dog("����", "��Ƽ��"),
				new Cat("����", 3)
		};
		
		for(Animal a : animals) {
			a.introduce();
			System.out.println();
		}
	}

}
