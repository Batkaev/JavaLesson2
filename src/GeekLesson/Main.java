package GeekLesson;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arr[] = {0, 0, 1, 1, 0, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==0){
                arr[i]=1;
            }
            else{
                if(arr[i]==1){
                    arr[i]=0;
                }
            }
            System.out.print(arr[i]);
        }
    }
}