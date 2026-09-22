import java.util.Arrays;

public class InsertionSortFluctuation {

    /**
     * Verilen 'ages' dizisini Insertion Sort ile sıralar ve
     * 'Toplam Geçici Dalgalanma' maliyetini hesaplar.
     *
     * @param ages Sıralanacak tamsayıların bir dizisi.
     * @return Sıralama işlemi sırasındaki toplam maliyet.
     */
    public static long calculateTemporalFluctuation(int[] ages) {
        long totalFluctuation = 0;
        int n = ages.length;

        // Dizinin ikinci elemanından başlayarak sona kadar ilerle
        for (int i = 1; i < n; i++) {
            int key = ages[i];
            int j = i - 1;

            // Anahtarı (key), kendisinden büyük olan sıralanmış bölümdeki
            // tüm elemanların üzerinden geçirerek doğru konumuna taşı
            while (j >= 0 && ages[j] > key) {
                // Bir eleman sağa kaydırıldığında maliyeti hesapla ve ekle
                totalFluctuation += (long)ages[j] - key;
                ages[j + 1] = ages[j];
                j--;
            }
            
            // Anahtarı doğru pozisyonuna yerleştir
            ages[j + 1] = key;
        }

        return totalFluctuation;
    }

    public static void main(String[] args) {
        // Örnek Senaryo
        int[] initialArray = {20, 5, 15, 8};
        System.out.println("Başlangıç Dizisi: " + Arrays.toString(initialArray));

        // Fonksiyonu çağır ve sonucu al
        long totalCost = calculateTemporalFluctuation(initialArray);

        // Sonucu yazdır
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(initialArray));
        System.out.println("Beklenen Toplam Dalgalanma: 39");
        System.out.println("Hesaplanan Toplam Dalgalanma: " + totalCost);

        // Test senaryosu
        if (totalCost == 39) {
            System.out.println("Örnek senaryo başarıyla tamamlandı.");
        } else {
            System.out.println("Hesaplama yanlış!");
        }
    }
}
