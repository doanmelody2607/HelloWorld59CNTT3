/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld59cntt3;

import mypackage.CaNhan;
import mypackage.HocSinh;

/**
 *
 * @author DELL
 */
public class HelloWorld59CNTT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Phím tắt ctrl+space
        System.out.println("Hello 59CNTT3");
        // Phím tắt sửa lỗi thiếu import
//        CaNhan c = new CaNhan("Minh", 20, "0123456");
//        // ctrl + /
//        System.out.println("Ten: "+ c.getTen());
//        System.out.println("Tuoi: "+ c.getTuoi());
//        System.out.println("sdt: "+ c.getSdt());
        
        CaNhan c = new CaNhan("Doan", 20, "0977267728");
        System.out.println("Ten: " + c.getTen());
        System.out.println("Tuoi: " + c.getTuoi());
        System.out.println("sdt: " + c.getSdt());
        
        HocSinh hs = new HocSinh();
        hs.setTen("Thanh");
        hs.setTuoi(21);
        hs.setSdt("12357");
        hs.setLop("59CNTT3");
        
        System.out.println(hs.getTT());
    }
    
}
