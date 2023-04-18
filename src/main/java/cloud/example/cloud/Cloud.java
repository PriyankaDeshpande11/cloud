package cloud.example.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cloud {
    @GetMapping("/clouddevops")
    public String getData(){
        return"store the data";

    }

}
