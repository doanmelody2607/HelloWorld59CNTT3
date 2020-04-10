/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author DELL
 */
public class CaNhan 
{
    // bổ từ truy cập default
    String ten;
    int tuoi;
    String sdt;
    //Constructor -- phím tắt alt + insert

    public CaNhan()
    {
    }

    public CaNhan(String ten, int tuoi, String sdt) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }
// getter
    public String getTen() {
        return ten;
    }
// setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String getTT()
    {
        return "ten: "+ ten +"\n"
                +"tuoi: " + tuoi+"\n"
                +"sdt: "+ sdt +"\n";
    }
}