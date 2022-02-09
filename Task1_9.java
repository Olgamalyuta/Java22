package Task1_9;

public class Task1_9 {
    public static void main(String[] args) {
        int [] ar1={1,2,3,4,5,6,7,8,9};
        int [] ar2={11,22,33};
        int k=5;
        int [] res =new int [ar1.length+ ar2.length];
        for(int i=0; i<k; i++) {
            res [i]=ar1[i];
        }
        int j=0;
        for (int i=k; i< k+ar2.length; i++){
               res[i]=ar2[j];
        j++;}

        for (int i=k+ar2.length; i< res.length; i++){
            res [i]=ar1[k];
        k++;}

        for (int i=0;i< res.length; i++)
        System.out.print(res[i] + " ");
    }
}
