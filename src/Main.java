// lab exercise 1:
// Loop and jumpping statement;
public class Main {
    public static void main(String[] args) {
        int n=0;

        //While and do while loop exercice
        //hello commit
        while(n<10) {
            
            n++;
            //for break or continue;
            if (n == 5) {
                break ;
                //here
            }
            System.out.println("hello " + n);

        }
        n=0;
        System.out.println("\n \t\t=========================\n");
        System.out.println("the following is do while loop and continue");
        do {

            //for break
            n++;
            if (n == 2) {
                continue;
            }
            System.out.println("hello " + n);
        }while(n<10);
    }}