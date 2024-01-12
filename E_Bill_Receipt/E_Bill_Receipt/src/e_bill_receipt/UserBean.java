/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_bill_receipt;

/**
 *
 * @author Rashda Khanzada
 */
public class UserBean {
    private int id;
    private int items;
    private double totalbill;
    private double discount;
    private double netbill;

    public UserBean(int id, int items, double totalbill, double discount, double netbill) {
        this.id = id;
        this.items = items;
        this.totalbill = totalbill;
        this.discount = discount;
        this.netbill = netbill;
    }
    
    public int getiid(){
       return id;
    }
    public int getitems(){
       return items;
    }
    public double gettotalbill(){
       return totalbill;
    }
    public double getdiscount(){
       return discount;
    }
    public double getnetbill(){
       return netbill;
    }
}
