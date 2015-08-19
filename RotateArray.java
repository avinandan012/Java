//http://www.careercup.com/question?id=5658654214717440


public class RotateArray
{
  public static void main(String[] args)
  {
    int rotationFactor = 4;
    int[] arr = {0,1,2,3,4,5,6,7,8,9};
  
    int[] arr2 = new int[arr.length];
    
    int count =0;
    for(int i=0;i<arr.length;i++)
  	{
      if(i<(arr.length-rotationFactor)){
      	arr2[i]=arr[i+rotationFactor];	
        
      }
      else{
       
      	arr2[i]=arr[count];
        ++count;
       // System.out.println("count : "+count);
      }
      
      System.out.println(arr2[i]);
  	}
  
  }
}
