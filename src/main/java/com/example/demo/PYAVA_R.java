package com.example.demo;

public class PYAVA_R {
    double getResult1(int n){
    if (n <= 0)
            return 0;
    if (n == 1)
            return -10;
    if (n == 2)
            return 2;
    return Math.abs(getResult1(n - 2)) - 6*getResult1(n - 1);
}

    double getResult2(int x)
    {
        return x == 1 ? 5 : getResult2(x + 1) * (x*x + x + 1);
    }
    double getResult10(double x, int m, int n)
    {
        if (m == n)
            return x/(n + x);
        return m + x / getResult10(x, m + 1, n);
    }

    void getResult6part2(int n, int i) {
        if (i <= n) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                if (j == i - 1)
                    System.out.print("\n");
            }
            i++;
            getResult6part2(n, i);
        }
    }

    void getResult6part3(int n, int i) {
        if (i <= n) {
            int l = 0;
            while (l < i) {
                System.out.print(i - l + " ");
                if (i - l == 1)
                    System.out.print('\n');
                l++;
            }
            i++;
            getResult6part3(n, i);
        }
    }

}
