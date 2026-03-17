public class Switch{
    public static void main(String[] args) {
        // Switch statements
        int i = 3;

        switch(i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is greater than 3");
                break;
        }
        
        int j = 5;

        switch(j){
            case 4:
                System.out.println("j is 4");
                break;
            case 5:
                System.out.println("j is 5");
                break;
            default:
                System.out.println("j is not 4 and 5");
                break;
        }
    }
}
