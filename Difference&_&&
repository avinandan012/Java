/*
* & is bitwise. && is logical.
* & evaluates both sides of the operation.
* && evaluates the left side of the operation, if it's true, it continues and evaluates the right side.
*/
// usage of && instead of & will be performance improvement
public class HelloWorld
{
  public static boolean func1()
  {
    System.out.println("inside func1");
    return false;
  }
  
  public static boolean func2()
  {
    System.out.println("inside func2");
    return true;
  }
  
  public static void main(String[] args)
  {
  //**************************************
  inside func1
  inside func2
  false
  //**************************************
  System.out.println(func1() & func2());
    
  
  //**************************************
  inside func1
  
  false
  //**************************************
  System.out.println(func1() && func2());  
  }
}
