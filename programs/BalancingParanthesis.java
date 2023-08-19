package programs;
import java.util.Scanner;

public class BalancingParanthesis {
    
    public static boolean isValid(String s){
        char[] stack = new char[s.length()];
        int head=0;
        for(char c : s.toCharArray()){
            switch(c){
                case '{':
                case '(':
                case '[':
                    stack[head++]=c;
                    System.out.println(stack);
                    break;
                case '}':
                    System.out.println(stack[head]);
                    if(head==0 || stack[--head] != '{') return false;
                    break;
                case ')':
                    System.out.println(stack[head]);
                    if(head==0 || stack[--head] != ')') return false;
                    break;
                case ']':
                    System.out.println(stack[head]);
                    if(head==0 || stack[--head] != ']') return false;
                    break;
                default : return false;
                }
        }
        
        return true;
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(isValid(s)==true){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        scanner.close();
    }
}
