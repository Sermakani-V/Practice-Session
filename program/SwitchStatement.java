import java.util.*;

class SwitchStatement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the variable value");
        
        int variable=sc.nextInt();
        switch(variable)
        {
            case 1:
            System.out.println("The value of the variable = "+variable);
            break;
            case 2:
            System.out.println("The value of the variable ="+variable);
            break;
            case 3:
            System.out.println("The value of the variable ="+variable);
            break;
            default:
            System.out.println("The value of the variable is neither 1 nor 2 nor 3");
        }
    }
}