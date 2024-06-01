/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.KhachSan;

public class ManagerKS {

    private static final ArrayList<KhachSan> listKhachSan = new ArrayList<>();

    public static void main(String[] args) {
        KhachSan khach1 = new KhachSan("Truong Tran Cuong", 20, "1122333", 3, "A");
        KhachSan khach2 = new KhachSan("Ho Thi Huong", 28, "3456789", 4, "B");
        KhachSan khach3 = new KhachSan("Truong Thi Ling", 24, "5678912", 7, "C");
        listKhachSan.add(khach1);
        listKhachSan.add(khach2);
        listKhachSan.add(khach3);
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        sc.nextLine();
//        KhachSan[] newKhach = new KhachSan[a];
//        addKhach(newKhach, a);
//        for (int i = 0; i < a; i++) {
//            listKhachSan.add(newKhach[i]);
//        }
//        for (int i = 0; i < listKhachSan.size(); i++) {
//            System.out.println(listKhachSan.get(i).toString());
//        }
//        TinhTien("678910");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Nhập số khách hàng muốn thêm: ");
                    int n = sc.nextInt();
                    KhachSan[] newKhach = new KhachSan[n];
                    addKhach(newKhach, n);
                    for (int i = 0; i < n; i++) {
                        listKhachSan.add(newKhach[i]);
                    }
                    break;
                case 2:
                    InforKhach();
                    break;
                case 3:
                    Scanner sn = new Scanner(System.in);
                    System.out.print("Nhập CMND: ");
                    String m = sn.nextLine();
                    RemoveKhach(m);
                    break;
                case 4:
                    Scanner sm = new Scanner(System.in);
                    System.out.print("Nhập CMND: ");
                    String k = sm.nextLine();
                    TinhTien(k);
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 5);

    }

    public static void menu() {
        System.out.println("==============MENU==============");
        System.out.println("1. Thêm thông tin khách hàng.");
        System.out.println("2. In thông tin khách hàng.");
        System.out.println("3. Xóa thông tin khách hàng.");
        System.out.println("4. Tính Tiền.");
        System.out.println("5. Thoát.");
    }

    public static void addKhach(KhachSan[] newKhach, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ và tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            int tuoi = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập CMND: ");
            String CMND = sc.nextLine();
            System.out.print("Nhập số ngày thuê: ");
            int soNgayThue = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập loại phòng: ");
            String loaiPhong = sc.nextLine();
            newKhach[i] = new KhachSan(hoTen, tuoi, CMND, soNgayThue, loaiPhong);
        }
    }

    public static void InforKhach() {
        for (int i = 0; i < listKhachSan.size(); i++) {
            System.out.println(listKhachSan.get(i).toString());
        }
    }

    public static void RemoveKhach(String CMND) {
        int flag = 0;
        for (int i = 0; i < listKhachSan.size(); i++) {
            if (listKhachSan.get(i).getCMND().equalsIgnoreCase(CMND)) {
                listKhachSan.remove(i);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Chứng Minh Nhân Dân sai!!!!!!");
        }
    }

    public static void TinhTien(String CMND) {
        int flag = 0;
        int soTienPhong = 0;
        String name = null;
        for (int i = 0; i < listKhachSan.size(); i++) {
            if (listKhachSan.get(i).getCMND().equalsIgnoreCase(CMND)) {
                int b = listKhachSan.get(i).getSoNgayTheu();
                name = listKhachSan.get(i).getHoTen();
                if (listKhachSan.get(i).getLoaiPhong().equalsIgnoreCase("A")) {
                    soTienPhong = 500 * b;
                } else if (listKhachSan.get(i).getLoaiPhong().equalsIgnoreCase("B")) {
                    soTienPhong = 300 * b;
                } else if (listKhachSan.get(i).getLoaiPhong().equalsIgnoreCase("C")) {
                    soTienPhong = 100 * b;
                }
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Số tiền phòng của " + name + " là: " + soTienPhong + "$");
        } else {
            System.out.println("Chứng Minh Nhân Dân sai!!!!!!");
        }
    }

}
