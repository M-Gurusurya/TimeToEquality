import java.util.Scanner;

public class TimeToEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=scanner.nextInt();
        int array[]=new int[size];
        int max=Integer.MIN_VALUE;
        //getting array inputs
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println(findTimeToEquality(array,max));
    }
    public static int findTimeToEquality(int array[],int max)
    {
        int size=array.length;
        int no_of_seconds=0;
        for (int i=0;i<size;i++)
        {
            no_of_seconds += max-array[i];
        }
        return no_of_seconds;
    }
}
