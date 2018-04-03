package test;

import animal.*;

public class AnimalTest01 {
	public static void main(String[] args) {
		Animal[] animals = {
				new Dog("허니", "치와와"),
				new Cat("나비", 5),
				new Dog("해피", "말티즈"),
				new Cat("벌이", 3)
		};
		
		for(Animal a : animals) {
			a.introduce();
			System.out.println();
		}
	}

}
