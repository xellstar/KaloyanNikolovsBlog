package softuniBlog.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorHandlerController {

    String path = "/error";

    @RequestMapping(value="/404")
    public String error404(){
        return path+"/404";
    }
}
