	import java.util.ArrayList;

	public class QueueString {
		ArrayList<String> wakanda = new ArrayList<String>();
		int sudarmin = -1;

		public void insert(String value) {
			sudarmin++;
			wakanda.add(sudarmin,value);
		}
		public String get() {
			String value = "KOSONG";
			if(sudarmin>-1) {
				value = wakanda.get(0);
				wakanda.remove(0);
				sudarmin--;
			}
			return value;
			
		}
		public void cetak() {
			System.out.println("STEP : "+sudarmin+" > KELAS: "+wakanda.toString());
		}
	}


