package cloud.example.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cloud {
    @GetMapping("/cloud")
    public String getData(){
        return "I am on 9th cloud";
    }
}
