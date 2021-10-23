package kz.fizmat.fizmatappbykarzhas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public int testRest(){
        System.out.println("ASDASDASD");
        return 3;
    }

}
