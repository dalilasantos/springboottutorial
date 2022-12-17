import com.pluralsight.service.SpeakerSevice;
import com.pluralsight.service.SpeakerSeviceImpl;

public class Application {
    public static void main(String[] args){

        SpeakerSevice sevice = new SpeakerSeviceImpl();

        System.out.println(sevice.findAll().get(0).getFirstName());
    }
}
