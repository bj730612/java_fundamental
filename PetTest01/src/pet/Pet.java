package pet;

public class Pet {
	private String name;
	private String masterName;
	
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMasterName() {
		return this.masterName;
	}
	
	public void introduce() {
		System.out.println("�� �� �̸��� " + name + "�Դϴ�.");
		System.out.println("�� ���δ��� " + masterName + "�Դϴ�.");
	}

}


