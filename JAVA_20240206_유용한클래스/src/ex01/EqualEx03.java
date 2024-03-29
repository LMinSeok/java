package ex01;

public class EqualEx03 {

	public static void main(String[] args) {

		Box2 b1 = new Box2(10);
		Box2 b2 = new Box2(10);

		System.out.println("1>>" + (b1 == b2));
		System.out.println("2>>" + (b1.equals(b2)));

	}

}

class Box2 {
	int x;

	public Box2(int x) {
		this.x = x;
	}

	@Override //객체 비교시 오버라이딩
	public boolean equals(Object obj) {
		if (obj instanceof Box2) {
			return x == ((Box2) obj).x;
		}
		return super.equals(obj);
	}

	// equal 메소드 재정의

}
