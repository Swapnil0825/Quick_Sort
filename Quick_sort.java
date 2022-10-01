import java.util.Scanner;

public class Quick_sort 
{
    public static void quicksort(int array[],int first,int last)
    {
        int i,j,pivot,temp;
        if(first<last)
        {
             
             i=first;
             j=last;
             pivot=first;
            while(i<j)
            {
                while(array[i] <= array[pivot])
                {
                    i++;
                }
                while(array[j]>=array[pivot])
                {
                    j--;
                }
                if(i<j)
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
              
                
                
            }
            temp=array[pivot];
            array[pivot]=array[j];
            array[j]=array[pivot];

            quicksort(array, first, j-1);
            quicksort(array, j+1, last);

        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array");
        n= sc.nextInt();
        int[] array=new int[100];
        System.out.println("Enter the array elemnts");
        for(i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }

        quicksort(array,0,n-1);

        System.out.println("Array elements are:");
        
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println();

        
    }
    
}
