
public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Student budi = new Student("123", "Budi", JenisKelamin.PRIA,
				Jurusan.TD);
		Student susi = new Student("234", "Susi", JenisKelamin.WANITA,
				Jurusan.AR);
		
		System.out.println(budi.toString());
		System.out.println(susi.toString());

		
	}

}
