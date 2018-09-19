package access;
//: access/Cake.java
// Accesses a class in a separate compilation unit.
// 在单独的编译单元中访问类


class Cake {
	public static void main(String[] args) {
		Pie x = new Pie();
		x.f();
	}
}
