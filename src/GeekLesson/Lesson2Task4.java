package GeekLesson;

public class Lesson2Task4 {
    public static void main(String[] args) {
        int k=1;
        int i = 0;
        int j = 0;
        int[][]array = new int[10][10];
        for( i = 0;i<array.length;i++){
            for(j = 0;j<array.length;j++){
                if(i==j)
                array[i][j]=k;
                else{
                    array[i][j]=0;
                }
            }}
            for(i=0;i<array.length;i++){
                for(j=0;j<array.length;j++){

                    System.out.print(array[i][j] + " ");}
                System.out.println();}

    }
}
