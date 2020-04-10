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
public class HocSinh extends CaNhan
{
    String lop;

    public HocSinh()
    {
    }

    public HocSinh(String lop, String ten, int tuoi, String sdt) 
    {
        super(ten, tuoi, sdt);
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }


    @Override
    public String getTT() {
        return super.getTT()
                + "lop: " + lop + "\n";
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
