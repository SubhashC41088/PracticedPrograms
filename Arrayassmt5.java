package multiarrayassmt;
public class Arrayassmt5 {
public static void main(String[] args) {
	int[][] array1 = {{1, 2, 5}, 
			          {5, 8, 9},
			          { 7, 10,8}};
	
    int[][] array2 = {{1, 0, 6}, 
    		          {15, 6, 4}, 
    		          {7, 0,8}};
    for (int i = 0; i < array1.length; i++) {  
    	for (int j = 0; j < array2.length; j++)
        System.out.println(array1[i][j] + " "); 
    	System.out.println();
    }  
    for (int i = 0; i < array1.length; i++) {  
    	for (int j = 0; j < array2.length; j++)
        System.out.println(array2[i][j] + " "); 
    	System.out.println();
    }
    
      for (int i = 0; i < array1.length; i++)
      {
          for (int j = 0; j < array2.length; j++)
          {
              if(array1[i][j] == (array2[i][j]))
              {
               System.out.println("Common element is : "+(array1[i][j]));
               }
          }
      }
}
}
