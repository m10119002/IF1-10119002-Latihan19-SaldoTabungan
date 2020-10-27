/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan19;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program saldo tabungan
 * 
 * 
 */
public class SaldoTabungan {
    
    private static String formatIt(String number) {
        int length = number.length();
        int preFL = length % 3; // preFL = preFirstLength
        int arrSize = ((length - preFL) / 3);
        
        int postFL = (preFL == 0)? 3 : preFL; // postFL = postFirstLength
        int beginIndex = 0;
        int endIndex = postFL;
        
        if(preFL > 0) arrSize += 1;
        
        String[] rawResult = new String[arrSize];
        for (int i = 0; i < arrSize; i++) {
            rawResult[i] = number.substring(beginIndex, endIndex);
            endIndex += 3;
            beginIndex = endIndex-3;
        }
        return String.join(".", rawResult);
    }
    
    public static void main(String[] args) {
        int saldoAwal = 2500000;
        int saldo = saldoAwal;
        double bungaPerBulan = 0.15;
        int lamaBulan = 6;
        
        for (int i = 1; i <= lamaBulan; i++) {
            saldo += (saldo*bungaPerBulan);
            String depan = "Saldo di bulan ke-";
            String nomor = Integer.toString(i);
            String tengah = " Rp.";
            String jum_saldo = formatIt(Integer.toString(saldo));
            String lengkap = depan.concat(nomor).concat(tengah).concat(jum_saldo);
            System.out.println(lengkap);
        }
    }
}
