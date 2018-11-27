package other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhiyp
 * @date 2018/10/11 0011 20:08
 */
public class OuterClass {

	public static void main(String[] args) {
		System.out.println(111);
	}
	public void main(){
		//实现一个接口
		List<String> stus = new ArrayList<>();
		Collections.sort(stus, new Comparator<String>() {
			@Override public int compare(String o1, String o2) {
				return o1.hashCode() - (o2.hashCode());
				 }
		});

		ITest testI = new ITest() {
			@Override
			public void goInterface(int i) {

			}
		};

		ITest testI1 = new ITest() {
			@Override
			public void goInterface(int i) {

			}
		};
		testI1.goInterface(1);

	}

	public class InnerClass1{
		public void do1(int i){
			main();
			i += 1;
		}
	}
}
