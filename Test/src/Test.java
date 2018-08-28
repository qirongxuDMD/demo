
public class Test {

	public static void main(String[] args) {
		int result = add(2, 4); // 返回值是int,所以用int型的result接收
		System.out.println(result);
		System.out.println(add(2, 5));// 既然方法有返回值，那麽可以直接輸出
		System.out.println(add(2, 3, 3));
		System.out.println(add(2.1, 2.2));
		value(20);
		value(23);
		System.out.println(sum(100));
		System.out.println(mul(60));

	}

	public static int add(int x, int y) {
		return x + y;
	}

//重载：方法名称相同，参数个数不用，
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

//重载：方法名称相同，返回类型不同
	public static double add(double x, double y) {
		return x + y;
	}

	public static void value(int x) {
		if (x == 23) {
			return;
		}
		System.out.println(x);
	}

//	1+....+100
	public static int sum(int num) {
		if (num == 1) {
			return 1;
		}
		return num + sum(num - 1);
	}

//	60!
	public static double mul(int num) {
		if (num == 1) {
			return 1;
		}
		return num * mul(num - 1);
	}

}
