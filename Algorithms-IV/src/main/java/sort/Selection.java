package sort;

public class Selection {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (Util.less(a[j], a[min])) min = j;
            }
            Comparable temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

}
