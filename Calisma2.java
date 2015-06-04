package calisma2;

import java.util.Random;

public class Calisma2 {
    public static int[] AltDizi(int[] array){
        int maxSifir = 0,altindis = 0,ustindis = 0;
        for(int i = 0;i<array.length;i++) {
            for(int j = i;j<array.length;j++) {
                int sifirSayisi = 0;
                boolean uygun_mu = true;
                for(int k = i;k<j;k++) {
                    if(array[k] == 1) uygun_mu = false;
                    if(array[k] == 0) sifirSayisi++;
                }
                if(uygun_mu) {
                    if(sifirSayisi > maxSifir) {
                        maxSifir = sifirSayisi;
                        altindis = i;
                        ustindis = j;
                    }
                }
            }
        }
        int [] dizi = new int[2];
        dizi[0] = altindis;
        dizi[1] = ustindis;
        return dizi;
        
    }
    public static void main(String[] args) {
        int dizi[] = new int[10];
        Random rand = new Random();
        for(int i = 0;i<10;i++) {
            dizi[i] = rand.nextInt(2); 
            System.out.print(dizi[i]);
        }System.out.println("");
        System.out.println(AltDizi(dizi)[0]);
        System.out.println(AltDizi(dizi)[1]);
    }
}
