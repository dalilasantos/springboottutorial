import com.pluralsight.repository.HibernateSpeakerRepositoryIml;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
//    @Bean(name = "speakerService")
//    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService speakerSevice(){
//     //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//     //service.setRepository(getSpeakerRepository());
//     return service;
//   }
   //Apenas um Bean será criado
//   @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryIml();
//   }
}
