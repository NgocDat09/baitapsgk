/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loaisinhvien;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class SVCDCQ extends Nguoi{
    protected float TDKT;
    protected int SMKT;
    protected float DTKTHP;

    public SVCDCQ() { super();
    }

    public SVCDCQ(float TDKT, int SMKT, float DTKTHP) {
        this.TDKT = TDKT;
        this.SMKT = SMKT;
        this.DTKTHP = DTKTHP;
    }

    public SVCDCQ(float TDKT, int SMKT, float DTKTHP, String hoTen, String diaChi, String loaiSV) {
        super(hoTen, diaChi, loaiSV);
        this.TDKT = TDKT;
        this.SMKT = SMKT;
        this.DTKTHP = DTKTHP;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.printf("nhap TDKT: "); TDKT = sc.nextFloat();
        System.out.printf("nhap SMKT: "); SMKT = sc.nextInt();
        System.out.printf("nhap DTKTHP: "); DTKTHP = sc.nextFloat();
    }

    @Override
    public float tinhDiem() {
        return (TDKT / SMKT + DTKTHP) / 3;
    }
    
}
