import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        System.out.println("\t \t \t" + "Lab 1 Java");
        //Task1();
        Task2();
        //Task3();
        //Task4();
    }
    static void Task1()
    {
        System.out.println("\t" + "\t" + "\t" + "Task 1" );
        Scanner in = new Scanner(System.in);

        System.out.print("x = ");
        float x = in.nextFloat();
        System.out.print("y = ");
        float y = in.nextFloat();

        float firstPart = (2 * (x * x) + (x * y)) / ((x * y) * (x * y));
        float secondPart = ((3 * x * y) - (y * y * y)) / ((x * x) + (2 * (y * y)));
        float result = firstPart + secondPart;

        System.out.println("Result = " + result);
    }
    static void Task2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\t" + "\t" + "\t" + "Task 2");

        System.out.print("k = ");
        int k = in.nextInt();
        int n;

        do
        {
            System.out.print("n = ");
            n = in.nextInt();
        } while (n > 200 || n < 1);

        k %= n;

        int[] a = new int[n];
        System.out.println("Початковий масив");
        for (int i = 0; i < n; i++)
        {
            a[i] = i;
            System.out.print(a[i]+"\t");
        }
        System.out.println();

        int[] tmp = new int[k];
        for (int i = 0; i < k; i++)
            tmp[i] = a[n - k + i];

        for (int i = 0; i < k; i++)
           for (int y = n - 1 - i; y >= k; y -= k)
               a[y] = a[y - k];

        for (int i = 0; i < k; i++)
            a[i] = tmp[i];

        System.out.println("Масив після зсуву");
        for (int i = 0; i < n; i++)
            System.out.print(a[i]+"\t");
        System.out.println();
    }
    static void Task3()
    {
        System.out.println("\t" + "\t" + "\t" + "Task 3");
        Scanner in = new Scanner(System.in);
        System.out.print(" n = ");
        int n = in.nextInt();
        int [][] x = new int[n][n];
        boolean [] y = new boolean[n];
        System.out.println();

        Arrays.fill(y, true);

        System.out.println(" Ввід матриці");
        for (int i = 0; i < n; i++)
        {
            System.out.println(" Введіть " + i + " рядок матриці");
            for (int j = 0; j < n; j++)
                x[i][j] = in.nextInt();
        }

        System.out.println();
        System.out.println(" Вивід матриці");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(x[i][j] + "\t");
            System.out.println();
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                for (int k = j + 1; y[i] && k < n; k++)
                    if (x[i][j] == x[i][k])
                        y[i] = false;
            }

        System.out.println("Результат");
        for (int i = 0; i < n; i++)
            System.out.print(y[i] + "\t");

    }
}
