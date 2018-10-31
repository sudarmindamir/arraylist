
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble sudarmin =new StackDouble();
		sudarmin.push(6.4);
		sudarmin.cetak();
		sudarmin.push(6.4);
		
		sudarmin.cetak();
		
		double d0=sudarmin.pop();
		System.out.println(d0);
		double d1=sudarmin.pop();
		System.out.println(d1);
		sudarmin.cetak();
		double d2=sudarmin.pop();
		System.out.println("tadaaaaaa");
	}

}
