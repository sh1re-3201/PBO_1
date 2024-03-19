package Modul_4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class NilaiMain {
    public static void main(String[] args) {
        boolean keluar = false;
        int count = 0;

        while (!keluar) {
            String input = JOptionPane.showInputDialog(null, "Masukkan jumlah mahasiswa yang ingin anda masukkan nilainya.");
            if (input == null) {// If statement ini berfungsi untuk keluar dari program jika user mengklik tombol X(silang) pada jendela
                return;
            }
            try {
                /*
                Karena penerimaan input dari JOptionPane secara default berupa String
                maka agar inputan dari user dapat dipakai menjadi jumlah panjang array,
                variabel Input di parse ke Integer variabel count
                 */
                count = Integer.parseInt(input);
                if (count <= 0){
                    JOptionPane.showMessageDialog(null, "Data yang dimasukkan tidak boleh nol atau kurang!");
                } else
                    keluar = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan data berupa angka. Silakan coba lagi.");
            }
        }
        Mahasiswa[] laporan = new Mahasiswa[count];// Menginstantiasi array of objek laporan dengan panjang setara inputan user
        for (int i = 0; i < laporan.length;) {
            String namaMhs = JOptionPane.showInputDialog(null, "Masukkan nama mahasiswa " + (i + 1));
            if (namaMhs == null) {
                return;
            }


            String nimMhs = JOptionPane.showInputDialog(null, "Masukkan nim mahasiswa " + (i + 1));
            if (nimMhs == null) {
                return;
            }

            String tglLahirMhs = JOptionPane.showInputDialog(null, "Masukkan tanggal lahir mahasiswa " + (i + 1));
            if (tglLahirMhs == null) {
                return;
            }
            /*
            if statement ini digunakan agar tidak ada data kosong yang bisa
            lewat dan dimasukkan ke array.
            dalam else terdapat increment yang bertujuan untuk memajukan
            for loop hanya jika seluruh data terisi.
             */
            if (namaMhs.isEmpty() || nimMhs.isEmpty() || tglLahirMhs.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tidak boleh ada data inputan yang kosong. Silakan coba lagi.");
            } else {
                laporan[i] = new Mahasiswa(namaMhs);
                laporan[i].setNim(nimMhs);
                laporan[i].setTglLahir(tglLahirMhs);
                i++;// Increment untuk for loop
            }
        }

        boolean boolNilai = false;
        while (!boolNilai){
            boolNilai = true;
            for (int i = 0; i < laporan.length; i++) {
                String uts1input = JOptionPane.showInputDialog(null, "Masukkan nilai UTS 1 dari : " + laporan[i].getNama());
                if (uts1input == null) {
                    return;
                }

                String uts2input = JOptionPane.showInputDialog(null, "Masukkan nilai UTS 2 dari : " + laporan[i].getNama());
                if (uts2input == null) {
                    return;
                }

                String uasinput = JOptionPane.showInputDialog(null, "Masukkan nilai UAS dari : " + laporan[i].getNama());
                if (uasinput == null) {
                    return;
                }
                try {
                    laporan[i].setUts1(Double.parseDouble(uts1input));
                    laporan[i].setUts2(Double.parseDouble(uts2input));
                    laporan[i].setUas(Double.parseDouble(uasinput));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, """
                            Masukkan data berupa angka.
                            Untuk bilangan desimal masukkan dengan menggunakan titik sebagai pemisah bukan koma
                            Silakan coba lagi.""");
                    boolNilai = false;
                    break;
                }
            }
        }

        // Metode mencari mahasiswa dengan nilai tertinggi
        Mahasiswa nilaiTertinggi = null;
        double nilaiMAXAkhir = Double.MIN_VALUE;
        for (int i = 0; i < laporan.length; i++) {
            double nilaiAkhir = laporan[i].nilaiAKhir();
            if (nilaiAkhir > nilaiMAXAkhir) {
                nilaiMAXAkhir = nilaiAkhir;
                nilaiTertinggi = laporan[i];
            }
        }

        String[] columnNames = {"Nama", "NIM", "Tanggal Lahir", "UTS1", "UTS2", "UAS", "Predikat"};
        Object[][] data = new Object[count][7];

        for (int i = 0; i < count; i++) {
            Mahasiswa mhs = laporan[i];
            data[i][0] = mhs.getNama();
            data[i][1] = mhs.getNim();
            data[i][2] = mhs.getTglLahir();
            data[i][3] = mhs.getUts1();
            data[i][4] = mhs.getUts2();
            data[i][5] = mhs.getUas();
            data[i][6] = mhs.predikat();
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JFrame frame = new JFrame("DAFTAR NILAI MAHASISWA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(scrollPane, BorderLayout.CENTER);
        // Menambahkan label untuk nilai tertinggi
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel labelNilaiTertinggi = new JLabel("Nilai tertinggi:");
        JLabel labelNim = new JLabel("Nim : " + nilaiTertinggi.getNim());
        JLabel labelNama = new JLabel("Nama : " + nilaiTertinggi.getNama());
        JLabel labelTglLhr = new JLabel("Tgl lhr : "  + nilaiTertinggi.getTglLahir());
        JLabel labelFinal = new JLabel("Final : "  + nilaiTertinggi.nilaiAKhir());
        JLabel labelNilai = new JLabel("Nilai : "  + nilaiTertinggi.predikat());

        panel.add(labelNilaiTertinggi);
        panel.add(labelNim);
        panel.add(labelNama);
        panel.add(labelTglLhr);
        panel.add(labelFinal);
        panel.add(labelNilai);

        frame.add(panel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
