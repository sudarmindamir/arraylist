import java.util.ArrayList;


public class StackDouble {
	ArrayList<Double> u =new ArrayList<Double>();
	public int sudarmin = -1;
	
		public void push(Double value){
			sudarmin++;
			u.add(sudarmin,value);
		}
		
			public double pop() {
				double value=sudarmin;
			if (sudarmin>-1){				
				value = u.get(sudarmin);
				u.remove(sudarmin);
				sudarmin--;
			}
			return value;
			}
			public void cetak(){
				System.out.println(u.toString());
			}
}
