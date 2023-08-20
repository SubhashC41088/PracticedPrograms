package video29;

public class ee { public static void main(String args[]) {
    
    String inputStr ="qwertyuiq sdfgvgfd";

    for(char i :inputStr.toCharArray()){
    if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
        System.out.println("First non-repeating character is: "+i);
        break;
    }
    }
}

}
