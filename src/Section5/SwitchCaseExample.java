
package Section5;

public class SwitchCaseExample {
    public static void main(String[] args) {
        char charVariable='B';
        switch(charVariable){
            case 'A':
                System.out.println("Character :"+charVariable);
                break;
            case 'B':
                System.out.println("Character :"+charVariable);
                break;
            case 'C':
                System.out.println("Character :"+charVariable);
                break;
            case 'D':case 'E':
                System.out.println("Character :"+charVariable);
                break;
            default:
                System.out.println("Message not found");
                break;
                
        }
    }
}
