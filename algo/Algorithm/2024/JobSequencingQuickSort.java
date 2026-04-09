 class Job {
    char id;     // İş ID'si
    int deadline; // İşin son teslim süresi
    int profit;   // İşin getirisi (kâr)

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencingQuickSort {

    // Quick Sort için iş sıralama fonksiyonu
    public static void quickSort(Job[] jobs, int low, int high) {
        if (low < high) {
            int pi = partition(jobs, low, high); // Pivot indeksi
            quickSort(jobs, low, pi - 1); // Pivotun sol kısmını sırala
            quickSort(jobs, pi + 1, high); // Pivotun sağ kısmını sırala
        }
    }

    // Pivot seçimi ve sıralama
    private static int partition(Job[] jobs, int low, int high) {
        Job pivot = jobs[high]; // Son elemanı pivot seç
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (jobs[j].profit > pivot.profit) { // Azalan sıralama için kontrol
                i++;
                // Swap işlemi
                Job temp = jobs[i];
                jobs[i] = jobs[j];
                jobs[j] = temp;
            }
        }

        // Pivotu doğru yerine taşı
        Job temp = jobs[i + 1];
        jobs[i + 1] = jobs[high];
        jobs[high] = temp;

        return i + 1;
    }

    // Maksimum kâr için iş sıralamasını bulan fonksiyon
    public static void jobScheduling(Job[] jobs, int n) {
        // İşleri sıralıyoruz (Quick Sort kullanılarak)
        quickSort(jobs, 0, jobs.length - 1);

        // Sonuç dizisi ve slot kontrol dizisi
        char[] result = new char[n];
        boolean[] slot = new boolean[n]; // Zaman dilimleri dolu mu boş mu?

        int totalProfit = 0;

        // İşleri tek tek kontrol ediyoruz
        for (int i = 0; i < jobs.length; i++) {
            // Bu iş için uygun bir slot bulmaya çalış
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                if (!slot[j]) { // Slot boşsa
                    slot[j] = true; // Bu slotu doldur
                    result[j] = jobs[i].id; // İş ID'sini slot'a yaz
                    totalProfit += jobs[i].profit; // Kârı ekle
                    break;
                }
            }
        }

        // Sonuçları yazdır
        System.out.print("Job Sequence: ");
        for (char job : result) {
            if (job != '\0') {
                System.out.print(job + " ");
            }
        }
        System.out.println("\nMaximum Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        // İşlerin tanımlanması
        Job[] jobs = {
            new Job('a', 2, 100),
            new Job('b', 1, 19),
            new Job('c', 2, 27),
            new Job('d', 1, 25),
            new Job('e', 3, 15)
        };

        int n = 3; // Maksimum zaman dilimi (deadline)
        jobScheduling(jobs, n);

    }
}

