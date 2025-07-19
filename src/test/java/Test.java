import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

    public static void main(String[] args){

        WebDriver d=new EdgeDriver();
        d.get("https://www.tcsion.com/hub/national-qualifier-test/");

    }
}
