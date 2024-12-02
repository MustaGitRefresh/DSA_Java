import java.util.Scanner;

public class Admission {
    int[] AdmNo;

    Admission(int size){
        AdmNo = new int[size];
    }

    void fillArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        for(int i=0;i<AdmNo.length;i++){
            AdmNo[i] = sc.nextInt();
        }
    }

    int binSearch(int l, int u, int v){
        int mid = (l+u)/2;
        int mid_element = AdmNo[mid];
        // proper element check
        if(AdmNo[l] > v || AdmNo[u] < v){
            return -1;
        }
        if(mid_element == v){
            return 1;
        }
        else if(v > mid_element){
            l = mid + 1;
            return binSearch(l, u, v);
        }
        else if(mid_element > v){
            u = mid - 1;
            return binSearch(l, u, v);
        }
        return 0;
    }

    public static void main(String[] args) {
        Admission ad = new Admission(4);
        ad.fillArray();
        System.out.println(ad.binSearch(0,3,10));
    }
}
