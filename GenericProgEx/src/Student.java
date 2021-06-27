
public class Student {
	private String nim;
	private String name;
	private JenisKelamin jk;
	private Jurusan jur;
	
	public Student()
	{
		
	}
	
	public Student(String nim, String name, JenisKelamin jk, 
			Jurusan jur)
	{
		this.nim = nim;
		this.name = name;
		this.jk= jk;
		this.jur = jur;
	}
	
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private JenisKelamin getJk() {
		return jk;
	}
	private void setJk(JenisKelamin jk) {
		this.jk = jk;
	}
	
	@Override
	public String toString()
	{
		return "nim = " + this.nim +", nama = " + this.name
				+ ", jenis kelamin = " + this.jk.name()
				+" , jurusan = " + this.jur.getDeskripsi();
	}
	
}
