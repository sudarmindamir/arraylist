import java.util.ArrayList;


public class ArrayListObject {

		ArrayList<Mahasiswa> biokuh;
		
	public ArrayListObject(){
		biokuh = new ArrayList<Mahasiswa>();
	}
	public void IsiData(String nama, String nim, char kelas, String alamat){
		biokuh.add(new Mahasiswa(nama,nim,kelas,alamat));
	}
	
	public static void main(String[] args) {
		ArrayList Data = new ArrayList();
		
		Data.add("Captain Sudarmin");
		Data.add("D0217302");
		Data.add("A");
		Data.add("Wakanda City");
		
		System.out.println("Biodatakuh : " +Data);
	}
		
}
