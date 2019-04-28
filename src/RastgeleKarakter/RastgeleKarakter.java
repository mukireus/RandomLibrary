/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RastgeleKarakter;

/**
*
* @author Muhammet ÖMER 
* @since 15.03.2019
* <p>
* Random Class
* </p>
*/
public class RastgeleKarakter {
   private int random;
   private String atama = "";
   private String atamaTemp = "";
      
   /**
    * Milisaniye cinsinden tarihi döndürür.
    * @param 
    * @return Zamanı Döndürür.
    */
    private long Now(){
        long now = System.nanoTime();
        return now;
    }
     
    /**
     * Rastgele karakter üretir. 
     * ASCII tablosundan yararlanır.
     * ASCII = 65 - 90 ve 97 - 122 Arasındadır.
     * @return (char) Rastgele karakter döndürür. 
     * @see Random(int)
     * @see Random(int,int)
     * @see Random(int,int,int)
     */
    public char Random(){
        char rastgele;
        while(true){
            random = (int)((Now())%123);
            // ASCI kodlarından yararlanıldı.
            if((random >= 65 && random <= 90) || (random >= 97 && random <= 122))
                break;
        }
        rastgele = (char) random;
        return rastgele;
    }

    /**
     * Parametre olarak gönderilen adet sayısı kadar rastgele bir harf oluşturmaya yarar.
     * @param adet
     * @return (String) İstenilen adet kadar rastgele harf döndürür.
     * @see Random()
     * @see Random(int,int)
     * @see Random(int,int,int)
     */
    public String Random(int adet){
        atama = "";
        for(int i=1;i<=adet;i++){
            random = RastgeleKarakter.this.Random();
            atama += (char) random;
        }
        return atama;
    }
    
    /**
     * Parametre olarak gönderilen iki karakter arasından rastgele karakter döndürmeye yarar.
     * @param karakterBir
     * @param karakterIki
     * @return (char) Gönderilen iki karakter arasından rastgele karakter döndürür.
     * @see Random()
     * @see Random(int)
     * @see Random(int,int,int)
     */
    public char Random(int karakterBir, int karakterIki){
        do{
            random = RastgeleKarakter.this.Random();
            if(random >= karakterBir && random <= karakterIki)break;
        }while(true);
        return (char) random;        
    }

    /**
     * Parametre olarak gönderilen iki karakter arasından gönderilen adet kadar karakter dizisi döndürmeye yarar.
     * @param karakterBir
     * @param karakterIki
     * @param adet
     * @return (String) Gönderilen iki karakter arasından istenilen adet kadar karakter dizini döndürür.
     * @see Random()
     * @see Random(int)
     * @see Random(int,int)
     */
    public String Random(int karakterBir, int karakterIki, int adet){
        atama = "";
        for(int i=1;i<=adet;i++){
            Random(karakterBir, karakterIki);
            atama += (char) random;
        }
        return atama;        
    }
    
    /**
     * Gelen toplam parametre sayısının moduna göre random sayı üretildi ve ascii ye dönüştürüldü..
     * @param karakterler
     * @return (char) Belirtilen karakter arasından rastgele karakter döndürür.
     * @see specifiedBetweenRandom(int,int...)
     */
    public char specifiedRandom(int... karakterler){
        atama = "";
        int sayac = 0;
        for(int i=0;i<karakterler.length;i++){
            atama += (char) karakterler[i]; 
            sayac++;
        }
         //Gelen toplam parametre sayısının moduna göre random sayı üretildi ve ascii ye dönüştürüldü..
        random = (int) ((Now())% sayac);
        return atama.charAt(random);
    }
    
    /**
     * Gelen toplam parametre sayısının moduna göre istenilen sayı kadar  random sayı üretildi ve ascii ye dönüştürüldü..
     * @param sayi
     * @param karakterler
     * @return (String) Belirtilen karakter arasından istenilen sayı kadar rastgele karakter döndürür.     
     * @see specifiedBetweenRandom(int,int...)
     */
    public String specifiedBetweenRandom(int sayi,int... karakterler){
        atama = "";
        int sayac = 0;
        for(int x=0;x<sayi;x++){
            for(int a=0;a<karakterler.length;a++){
                atamaTemp += (char)karakterler[a]; 
                sayac++;
            }
        random = (int)((Now())%sayac); //gelen toplam parametre sayısına bölümünden kalana göre random sayı üretildi.
        atama += atamaTemp.charAt(random);
        }
        return atama;
    }
    
    /**
     * İstenilen kelime sayısı kadar cümle üretiyor.
     * @param kelimeSayisi
     * @return (String) Cümle döndürür.
     */
    public String Sentence(int kelimeSayisi){
        atama = "";
        random = (int)((Now())%123);
        for(int i=0;i<kelimeSayisi;i++){
            atama += RastgeleKarakter.this.Random();
            if(random == kelimeSayisi)
                atama += " ";
        }
        return atama;
    }
}