public class Totorial03 {
    public static void main(String[] args) {
        System.out.println("------Question1---------");
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        try {
            System.out.println("the 9th index is :" + array[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e.getMessage());
            System.out.println("Warning");
        }
        System.out.println("------Question2---------");
        int mark = 100;
        if (mark >= 50) {
            System.out.println("Pass");
            Done();
        } else {
            System.out.println("Fail");
            Done();
        }

        try {
          check(20);

        } catch (Exception e) {
        e.printStackTrace();
        }

    }
    public static void Done(){
        System.out.println("Done");
    }
    public static void check(int var) throws Exception {
        try {
            if (var %5!=0){
                throw new Exception("The numbers does not divide by 5");
            }
            else{
                System.out.println("The number divided by 5");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
