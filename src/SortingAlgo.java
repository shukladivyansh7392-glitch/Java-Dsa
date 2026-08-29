public class SortingAlgo {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){ //rounds
            for(int j=0; j<n-i-1; j++){   //neighbouring elements Comparision
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        //OuterLoop
        for(int i=0; i<n-1; i++){
            int minindex = i;

            //inner lopp -> Comparision ->> arr[j] and arr[minindex]
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            //jab mera comparision complete ho jayega
            //to mai minindex wali value ko correct position par place kr dunga
           // arr[i] =arr[minindex];
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = i;
            int Prev = i - 1;
            int currValue = arr[curr];
            while (Prev >= 0 && currValue < arr[Prev]) {
                arr[Prev + 1] = arr[Prev];
                Prev--;
                //ab hamare pass ek khali jagah a chuki hai
                //ab place the currValue
                arr[Prev + 1] = currValue;
            }
        }


    }
    static void main(){
        int arr[] = {5,6,4,1,3,2};
        insertionSort(arr);
        System.out.println("Printing the array :-");
        for(int value: arr){
            System.out.print(value + " ");
        }
    }
}


