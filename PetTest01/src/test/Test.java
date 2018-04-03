package test;

import pet.*;

public class Test {
	public static void main(String[] args) {
		Pet[] p = {
				new Pet("¹úÀÌ", "ÀÌ¼­Áø"),
				new RobotPet("±øÅëÀÌ", "Â÷½Â¿ø"),
				new Pet("³ªºñ", "ÀÌ½Â±â")
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
