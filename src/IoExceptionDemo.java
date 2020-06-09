import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IoExceptionDemo {

    void checkException()  {
        File f=new File("/Users/abhi/Desktop/abc1.txt");
        try {
            FileInputStream fis=new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Type of exception :"+e);
        }
        System.out.println("Hellllllooooooo");
    }

    public static void main(String[] args)  {
        IoExceptionDemo ie=new IoExceptionDemo();
  //      try {
            ie.checkException();
//      } catch (FileNotFoundException e) {
//            System.out.println("Type of exception: "+e);
//        }
        System.out.println("Hiiiiiiiiiii");
    }
}
