public class TestObj {
    public static void main(String[] args) {
        try{
            Triangle tr1 = new Triangle();
            System.out.println(tr1.toString());
            System.out.println("------------------------------------------");
            Triangle tr = new Triangle(1, 2, 3, false);
        }
        catch(IllegalTriangleException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}