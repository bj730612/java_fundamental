
class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override // Annotation - �����Ϸ����� �˷��ִ� �ּ�
	String getLocation() {
		//return "x : " + x + ", y ; " + y + ", z : " + z;
		return super.getLocation() + " z : " + z; // �θ��� �޼��� ȣ��
	}
}

public class Point3DTest {
	public static void main(String[] args) {
		Point3D p = new Point3D(100, 200, 50);
		System.out.println(p.getLocation());
	}

}
