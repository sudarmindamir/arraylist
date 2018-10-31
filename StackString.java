import java.util.ArrayList;


public class StackString {
	ArrayList<String> k = new ArrayList<String>();
	int sudarmin = -1;
	
	public void push(String value){
		sudarmin++;
		k.add(sudarmin,value);
	}
	public String pop(){
		String value = "KOSONG";
		if (sudarmin>-1){
		value = k.get(sudarmin);
		k.remove(sudarmin);
		sudarmin--;}
		return value;
		}
	
	public void cetak (){
		System.out.println("afri : " +sudarmin+ " # namanya : "+k.toString());
	}
}



