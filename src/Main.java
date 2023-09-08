import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        System.out.println("\t \t \t" + "Lab 1 Java");
        Task1();
        Task2();

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
        int n = 0;

        do {
            System.out.print("n = ");
            n = in.nextInt();
        } while (n > 200 || n < 1);

        if (k > n)
            System.out.println("Вихід за межі масиву");
        else
        {
            int[] a = new int[n];
            System.out.println("Початковий масив");
            for (int i = 0; i < n; i++)
                System.out.print(i + "\t");
            System.out.println();

            for (int i = 0; i < k; i++)
            {
                for (int y = 0; y < k; y++)
                {
                }
            }
        }


    }
}
