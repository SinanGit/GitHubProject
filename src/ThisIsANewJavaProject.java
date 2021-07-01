public class ThisIsANewJavaProject {
    public static void main(String[] args) {
        int[] tryMe = {1,2,3,4,5};
        for (int i = tryMe.length-1; i >=0 ; i--) {
           System.out.print(tryMe[i]+" ");
            if (tryMe[i]==1){
                System.out.println("Finished");
            }
        }
    }
}
