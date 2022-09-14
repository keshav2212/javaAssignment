
import java.io.*; 
import java.util.*;

public class PythaGoreanTemplate{
    public static List<int[]> findTriplets(int n){
        List<int[]> triplets = new ArrayList<int[]>();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = j; k <= n; k++) {
                    if ((i + j + k) == n) {
                        if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                            int a[] = {i, j, k};
                            triplets.add(a);
                        }
                    }
                }
            }
        }
        return triplets;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        List<int []> triplets = findTriplets(n);
        for(int i=0;i<triplets.size(); i++){
            System.out.println(triplets.get(i)[0]+" "+triplets.get(i)[1]+" "+triplets.get(i)[2]);
        }
    }
}