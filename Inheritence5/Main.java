import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ================= MAHASISWA =================

        System.out.println("=== INPUT DATA MAHASISWA ===");

        System.out.print("Nama Mahasiswa : ");
        String namaMhs = input.nextLine();

        System.out.print("Alamat Mahasiswa : ");
        String alamatMhs = input.nextLine();

        Student s1 = new Student(namaMhs, alamatMhs);

        System.out.print("Jumlah Mata Kuliah : ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMK; i++) {

            System.out.print("Nama Mata Kuliah : ");
            String mk = input.nextLine();

            System.out.print("Nilai : ");
            int nilai = input.nextInt();
            input.nextLine();

            s1.addCourseGrade(mk, nilai);
        }

        System.out.println();
        System.out.println(s1);

        System.out.println("Daftar Nilai:");
        s1.printGrades();

        System.out.println("Rata-rata Nilai : " + s1.getAverageGrade());

        // ================= DOSEN =================

        System.out.println("\n=== INPUT DATA DOSEN ===");

        System.out.print("Nama Dosen : ");
        String namaDosen = input.nextLine();

        System.out.print("Alamat Dosen : ");
        String alamatDosen = input.nextLine();

        Teacher t1 = new Teacher(namaDosen, alamatDosen);

        System.out.print("Jumlah Mata Kuliah yang Diajar : ");
        int jumlahAjar = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahAjar; i++) {

            System.out.print("Nama Mata Kuliah : ");
            String mk = input.nextLine();

            boolean hasil = t1.addCourse(mk);

            if (hasil) {
                System.out.println("Berhasil ditambahkan");
            } else {
                System.out.println("Mata kuliah sudah ada");
            }
        }

        System.out.println();
        System.out.println(t1);

        input.close();
    }
}