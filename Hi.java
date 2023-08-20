package arrayassmt;
public class Hi {
	public static void main(String[] args){     
		String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
		String word = "", small = "";    
		String[] words = new String[15];    
		int length = 0;    
		string = string + " ";    
		for(int i = 0; i < string.length(); i++){    
			if(string.charAt(i) != ' '){    
				word = word + string.charAt(i);    
			
			}     
			else{    
				words[length] = word;    

				length++;    

				word = "";    
			} 	
		}            
		small = words[0];   
          
		for(int k=0; k < length; k++)
		{    
			if(small.length() > words[k].length())  
				small = words[k];
			
		}
		System.out.println("Smallest word: "+  small);
		 System.out.print("Index of :"+small );
		
		 if(small==words[0]){
			 System.out.println(" is '0'");
		 }
		 else if(small==words[1]) {
	     		System.out.println(" is '1'");
          } 
		 else if(small==words[2]) {
	     		System.out.println(" is '2'");
       } 
		 else if(small==words[3]) {
	     		System.out.println(" is '3'");
       } 
		 else if(small==words[4]) {
	     		System.out.println(" is '4'");
       } 
		 else if(small==words[5]) {
	     		System.out.println(" is '5'");
       } 
		 else if(small==words[6]) {
	     		System.out.println(" is '6'");
       }
		 else if(small==words[7]) {
	     		System.out.println(" is 7");
       }
		 else if(small==words[8]) {
	     		System.out.println(" is 8");
       } 
}
}
