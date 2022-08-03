import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Author author1= new Author("Salha","salha@gmail.com");
        System.out.println(author1.toString());
        Ball ball1 = new Ball(2 , 3,4,5,6);
        System.out.println(ball1.toString());
       ball1.move();
       ball1.reflectHorizontal();
       ball1.reflectVertical();
Employee employee1 = new Employee(439003156,7000,"Salha","Alasmari");
employee1.getName();
        System.out.println("Your annual salary is ....");
        System.out.println(employee1.getAnnualSalary());
        System.out.println("Your raise salary by percent 15% is");
        System.out.println(employee1.raisSalary(15));
        System.out.println(employee1.toString());
        InVoiceItem inVoiceItem1 = new InVoiceItem("439003156" , "A",44,8.0);
        System.out.println("the total is "+inVoiceItem1.getTotal());
        myPoint myPoint1 = new myPoint(2,2);
        System.out.println(myPoint1);
        myPoint[] array = new myPoint[2];
        array[0]= new myPoint(4,4);
       array[1]= new myPoint(7,9);
        System.out.println(Arrays.toString(array[0].getXY()));
        System.out.println(Arrays.toString(array[1].getXY()));
        myPoint1.setXY(3,3);
        myPoint myPoint2= new myPoint(4,4);
        System.out.println(myPoint2.distance());

    }
}