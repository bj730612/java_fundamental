package test;

import pet.*;

public class Test {
	public static void main(String[] args) {
		Pet[] p = {
				new Pet("����", "�̼���"),
				new RobotPet("������", "���¿�"),
				new Pet("����", "�̽±�")
		};
		
		for(Pet a : p) {
			a.introduce();
			if(a instanceof RobotPet) {
				((RobotPet) a).work(2);
				}
			System.out.println();
		}
	}

}
