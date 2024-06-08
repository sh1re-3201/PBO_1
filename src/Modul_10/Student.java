package Modul_10;

public class Student implements Learner{
    protected final static int BANYAK_TES = 3;
    protected String nama;
    protected int[] tes;
    protected String nilaiMataKuliah;

    public Student(){
        this("No Nama");
    }

    public Student(String namaMhs){
        nama = namaMhs;
        tes = new int[BANYAK_TES];
        nilaiMataKuliah = "****";
    }

    @Override
    public String getCourseGrade(){
        return nilaiMataKuliah;
    }
}
