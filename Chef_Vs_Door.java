import java.util.*;

class Chef_Vs_Door {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = 0;
            int no = 1;
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                no = no * arr[i];
            }
            if (no % 2 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}