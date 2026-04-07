package com.ShreeBenakaSpace.ShreeBenakaSpace.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShreeBenakaController
{
    @GetMapping("/welcome")
    public String welCome(){
        return " Welcome to ShreeBenakaSpace";

}
}
