import java.util.Scanner;
public class LinearSearching
{
    public static void main()
    {
        LinearSearching a = new LinearSearching();
        Scanner sc = new Scanner(System.in);
        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1728,1729}; //Array to be used
        System.out.println("Enter the element you want to search for: ");
        int element = sc.nextInt(); //Element which is supposed to be searched in the array
        int length = array.length; //Size of the array (Number of elements in the array)
        int result = a.Result(array, length, element);
        if(result!=-1)
        {
            System.out.println("The element is present in the array at index position "+result);
        }
        
        else
        {
            System.out.println("The element is not present in the array");
        }
        
    }
    
    public int Result(int array[], int length, int element)
    {
        int index = -1; //Initial value of index
        for(int i =0; i<length; i++)
        {
            if(array[i] == element)
            {
                index = i;
                return index; //This statement will return the index position (i)
            }
            
            else
            {
                continue;
            }
        }
        return index; //If conditions inside theloop do not satisfy, this statement will return the initial value of index
    }
}
