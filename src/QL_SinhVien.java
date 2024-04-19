import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;



public class QL_SinhVien extends SinhVien{
    public static String FILE_NAME = "students.txt";
    public static String COMMA= ",";
    public java.util.ArrayList<SinhVien> sinhViens;
    private java.util.ArrayList ArrayList;

    public QL_SinhVien(){
        ArrayList<SinhVien> sinhViens1 = new ArrayList<>();
        this.sinhViens = sinhViens1;
    }

    public void menu(){
        int n;
        do {
            // Hiển thị menu lựa chọn
            Scanner sc = new Scanner(System.in);
            System.out.println("___CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN___");
            System.out.println("Chọn chức năng theo số:");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Thoát");

            // chọn chức năng
            System.out.print("Chọn chức năng: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                     hienThi();
                    break;
                case 2:
                    themSinhVien();
                    break;
                case 3:
                    System.out.print("Nhập id sản phẩm cần xóa: ");
                    int xoa = sc.nextInt();

                    break;
                case 4:
                    System.out.println("DANH SÁCH SẢN PHẨM");


                    break;

            }

        } while (n != 5);
        System.out.println("\t Xin cảm ơn");
    }

    //2 thêm mới
    public SinhVien  themSinhVien(){


        try {
            int msv;
            String hoTen;
            int tuoi;
            String gT;
            String diaChi;
            int diem ;
            Scanner sc = new Scanner(System.in);
            System.out.print("Thêm Họ tên: ");
            hoTen = sc.nextLine();
            System.out.print("Thêm mã sinh viên: ");
            msv = sc.nextInt();

            System.out.print("Thêm tuổi: ");
            tuoi = sc.nextInt();
            System.out.println("Thêm Giới tính: ");
            gT = sc.nextLine();
            sc.nextLine();
            System.out.print("Thêm Địa chỉ:  ");
            diaChi = sc.nextLine();
            System.out.print("Thêm Điểm TB:  ");
            diem = sc.nextInt();

            FileWriter fileWriter;
            fileWriter = new FileWriter(FILE_NAME,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(msv + COMMA +  hoTen +COMMA + tuoi + COMMA + gT + COMMA + diaChi +COMMA +diem);
            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {

        }



        return null;

    }
    // đọc file
    public List<SinhVien> docFile(){
        FileReader fileReader = null;
        List<String> list = new ArrayList<>();
        List<SinhVien> sinhVienList = new ArrayList<>();
        try {
            fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line1 = null;
            while ((line1 = bufferedReader.readLine()) != null){
                list.add(line1);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String line1: list ){
            String[] line2 ;
            line2 = line1.split(COMMA);
            SinhVien  sinhVien = new SinhVien(Integer.parseInt(line2[0]),line2[1],Integer.parseInt(line2[2]),line2[3],line2[4],Integer.parseInt(line2[5]));
            sinhVienList.add(sinhVien);
        }

        return sinhVienList;
    }
    public void hienThi(){
        FileReader fileReader = null;
        List<String> list = new ArrayList<>();
        try {
            fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line1 = "";
            while ((line1 = bufferedReader.readLine()) != null){
                list.add(line1);
            }
            for (String doc1:list){
                System.out.println(doc1);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
