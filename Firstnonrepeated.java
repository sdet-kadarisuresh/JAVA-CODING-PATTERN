// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//first non-repeated

class Firstnonrepeated {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        String str="abcdabf";

        int[] count=new int[256];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }

        for(int i=0;i<256;i++){
            if(count[i]==1){
                       System.out.println((char)i+" -"+count[i]);
                break;
            }
        }
    }
}
