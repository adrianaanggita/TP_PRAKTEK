
public enum Jurusan {
	SI("01", "Sistem Informasi"),
	RPL("02", "Rekayasa Perangkat Lunak"),
	TI("03", "Teknik Informatika"),
	TD("04", "Teknik Informatika"),
	AR("05", "Teknik Arsitektur");
	
	private String kode;
	private String deskripsi;
	
	//urutan constructor
	private Jurusan(String deskripsi, String kode)
	{
		this.kode = kode;
		this.deskripsi = deskripsi;
	}
	
	public String getKode() {
		return kode;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	
	
	
	
}
