package BT;

import java.util.*;
import java.io.*;

public class Dijkstra {
    
    private static final int MAX = 50;
    private static final int VOCUNG = 10000000;

    private int n; // Number of vertices.
    private int s; // Start vertex.
    private int t; // End vertex.

    private int[] truoc = new int[MAX]; // Previous vertex in path.
    private int[] d = new int[MAX]; // Distance array.
    private int[][] Matrix = new int[MAX][MAX]; // Weight matrix.
    private boolean[] chuaxet = new boolean[MAX]; // Visited array.

    public void init() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\JAVA\\eclipse-workspace\\DE1\\src\\BT\\DIJKSTRA.txt"));

        n = scanner.nextInt();

        System.out.println("So dinh: " + n);

        s = scanner.nextInt();
        t = scanner.nextInt();
        //Đọc ma trận trọng số 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                Matrix[i][j] = scanner.nextInt();
                if (Matrix[i][j] == 0) {
                    Matrix[i][j] = VOCUNG;
                }
            }
        }

        scanner.close();
    }

    public void result() {
        System.out.println("Duong di ngan nhat tu " + (char)(s + 'A' - 1) + " den " + (char)(t + 'A' - 1) + " la");

        System.out.print((char)(t + 'A' - 1) + "<=");

        int i = truoc[t];
        while (i != s) {
            System.out.print((char)(i + 'A' - 1) + "<=");
            i = truoc[i];
        }

        System.out.println((char)(s + 'A' - 1));
        System.out.println("Do dai duong di la: " + d[t]);
    }

    public void dijkstra() {
        int u, minp;
        
        for (int v = 1; v <= n; v++) {
            d[v] = Matrix[s][v];
            truoc[v] = s;
            chuaxet[v] = false;
        }

        truoc[s] = 0;
        d[s] = 0;
        chuaxet[s] = true;

        while (!chuaxet[t]) {
            minp = VOCUNG;
            u = -1;  // Initialize u
            // Tìm đỉnh u sao cho d[u] là ngắn nhất
            for (int v = 1; v <= n; v++) {
                if (!chuaxet[v] && minp > d[v]) {
                    u = v;
                    minp = d[v];
                }
            }
            
            if (u == -1) break;  // No path exists
            
            chuaxet[u] = true;
            //so sanh d[u] + matrix[u][v] voi d[v]
            if (!chuaxet[t]) {
                for (int v = 1; v <= n; v++) {
                    if (!chuaxet[v] && d[u] + Matrix[u][v] < d[v]) {
                        d[v] = d[u] + Matrix[u][v];
                        truoc[v] = u;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Dijkstra algorithm = new Dijkstra();

        algorithm.init();
        algorithm.dijkstra();
        algorithm.result();
    }
}





