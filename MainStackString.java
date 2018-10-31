import java.util.Stack;


public class MainStackString {

public static void main(String[] args) {
StackString sudarmin = new StackString();
		
	sudarmin.push(" ini");
    sudarmin.push("adalah");
	sudarmin.push("saya");
	sudarmin.push("tadaaaa");
		
		String d0=sudarmin.pop();
		System.out.println(d0);
		sudarmin.cetak();
		
						
	}

}
