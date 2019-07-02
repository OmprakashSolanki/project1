import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HelloWorld {

	public static void main(String[] args) {
		int oldCap = 1;
		// System.out.println(15&98);
		String s1 = "aman";
		String s2 = "Tarun";

		// Integer num=97;
		System.out.println(s2.hashCode());
		// System.out.println(System.identityHashCode(s1));

		System.out.println("................");

		System.out.println(s2.hashCode() >>> 16);
		// System.out.println(System.identityHashCode(s2));

		System.out.println("................");
		// System.out.println(num.hashCode());

		// System.out.println(System.identityHashCode(num));

		int h;

		System.out.println(((h = s2.hashCode()) ^ (h >>> 16)));

		System.out.println(((h = s2.hashCode()) ^ (h >>> 16)) & 15);

		// A a=new A();
//		A s=new A(3);

		// System.out.println("Welcome to jenkins");
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		MyConsumer consumer = new MyConsumer();
		list.forEach(consumer);
	}
}

class MyConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.println("Value ::" + t);
	}
}
