package cloud.example.cloud;

import org.springframework.web.bind.annotation.GetMapping;

public class Cloud {
    @GetMapping("/Cloud")
    public String getData(){
        return"store the data";

    }
}
