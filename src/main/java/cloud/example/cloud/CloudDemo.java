package cloud.example.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudDemo {
    @GetMapping("/mycloud")
    public String getData(){
        return "GitHub Desktop is an application";

    }
}
