
public class Test {

	public static void main(String[] args) {
		int result = add(2, 4); // ����ֵ��int,������int�͵�result����
		System.out.println(result);
		System.out.println(add(2, 5));// ��Ȼ�����з���ֵ���������ֱ��ݔ��
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

//���أ�����������ͬ�������������ã�
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

//���أ�����������ͬ���������Ͳ�ͬ
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
