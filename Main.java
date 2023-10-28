public class Main{
    public static void main (String[] args){
        int firstArg = 0;

        if (args.length > 0){
            // turn string input argument into usable integer
            try {
                firstArg = Integer.parseInt(args[0]);
            }
            // if user does not enter int generate error
            catch (NumberFormatException e){
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        else {
            System.out.println("Error: Use |java Main n| where n is the Fibonacci number desired.");
            System.exit(1);
        }

            int a = 0, b = 1;
            int result = 0;


            // 0 fib number = 0
            if (firstArg == 0){
                result = 0;
            } 

            // 1 fib number = 1
            if (firstArg == 1){
                result = 1;
            }
            

            // fib number calculator
            for (int i = 2; i <= firstArg; i++){
                result = a + b;
                a = b;
                b = result;
    
            }
            //return result;



            System.out.println(result);
    }
}