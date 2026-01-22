package project5;
import java.util.Scanner;
class task5
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];//single dimensional array
        for(int i = 0; i < n; i++)//input values into array
        {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        //calculating sum, max, min
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        double avg = (double) sum / n;//calculating avg
        for(int i = 0; i < n-1; i++)//manual sorting
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nOutput:\n");//output
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.print("Sorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n2D Array Example:\n");
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };//multidimentional array
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        try
        {
            System.out.println("\nAccessing invalid index:");
            System.out.println(arr[100]);//invalid index
        }
        catch(ArrayIndexOutOfBoundsException e)//exception handling
        {
            System.out.println("Error: Array index out of bounds");
        }
    }
}
