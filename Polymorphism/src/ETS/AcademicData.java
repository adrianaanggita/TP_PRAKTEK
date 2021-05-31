package ETS;

public class AcademicData extends CollegeData{
    public void academicDetail(){
        System.out.println("Semester : Genap 2020/2021");
        System.out.println("Mata Kuliah : Teknik Pemrogaman");
    }
    public void studentData() {
        String[] nama = {"Adriana Anggita Daeli", "Andre Saefulloh","Algi Fari Ramdhani","Anna Kurniaty"};
        for(int i = 0; i< nama.length; i++){
            System.out.println("Nama Mahasiswa"+(i+1) +" :"+nama[i]);
        }
    }
}
