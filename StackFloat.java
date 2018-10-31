import java.util.ArrayList;


public class StackFloat {
	ArrayList<Float> kotak =new ArrayList<Float>();
	public int sudarminkuh = -1;
	
	public void push(float value){
		sudarminkuh++;
		kotak.add(sudarminkuh,value);
	}
	public float pop(){
		float value = sudarminkuh;
		if (sudarminkuh>-1){
			value = kotak.get(sudarminkuh);
			kotak.remove(sudarminkuh);
			sudarminkuh--;
		}
		return value;}
		public void cetak(){
	System.out.println(kotak.toString());
		}
}
