/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan20.targettabungan;

/**
 *
 * @author User
 */
public class PBO210118055Latihan20TargetTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double saldo = 3500000;
        int i=0;
       
        
       do{
        saldo = saldo +(saldo*0.08);  
        i= i+1;
        System.out.println("saldo di bulan ke-"+i+"Rp."+saldo);
        
        }while(saldo<6000000);
        
        
    }
    
}
