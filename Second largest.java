// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
int arr[]={2,5,10,4,232,43,43};
        int large=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int num:arr){

            if(num>large){
                second=large;
                large=num;
            }else if(num>second && num!=large){
                second=num;
            }
        }
                System.out.println("Start small. Ship something."+second);

    }
}
