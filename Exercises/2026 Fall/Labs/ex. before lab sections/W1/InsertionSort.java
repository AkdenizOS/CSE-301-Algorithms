public class InsertionSort {
    

 public static void main(String[] args) {
    
    int[] ages = {20, 5, 15, 8};
    int n = ages.length;

    for(int i = 1; i<n ; i++){

        int key = ages[i];
        int j = i-1;

        while(j>=0 && ages[j]>key){

            ages[j+1] = ages[j];
            j--;

        }

        ages[j+1] = key;

    }

    for(int i=0; i<n; i++){
        System.out.print(ages[i] + " ");
    }


 }

}
