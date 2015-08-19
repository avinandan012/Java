//http://www.careercup.com/question?id=5658654214717440


import java.lang.Math; 
import java.util.Arrays;


public class RotateArray
{
  public static void main(String[] args){
  	
    int rotationFactor = 4;
    
    int[] arr = {0,1,2,3,4,5,6,7,8,9};
    
    int[] rotatedArr = rotateArray(arr,rotationFactor);
    	for(int i=0;i<arr.length;i++){
    	System.out.println(rotatedArr[i]);
    
       }
  	
  }
  
  
  public static int[] rotateArray(int[] arr,int rotationFactor)
  {
    
  
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
      
      }
      
      
  	}
  return arr2;
  }
}
