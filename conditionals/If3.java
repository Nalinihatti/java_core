public class If3{
    public static void main(String[] args){
        // int i = 5;
        // // if-else-if ladder
        // if(i == 5){
        //     System.out.println("i is 5");
        // }
        // else if(i == 6){
        //     System.out.println("i is 6");
        // }
        // else if(i == 7){
        //     System.out.println("i is 7");
        // }
        // else if(i == 8){
        //     System.out.println("i is 8");
        // }
        // else if(i == 9){
        //     System.out.println("i is 9");
        // }

        int age = 50;

        if(age > 80){
            System.out.println("You are very old");
        }
        else if(age > 60){
            System.out.println("You are old");
        }
        else if(age > 40){
            System.out.println("You are becoming old");
        }
        else if(age > 20){
            System.out.println("You are young");
        }
        else{
            System.out.println("You are child");
        }
    }
}