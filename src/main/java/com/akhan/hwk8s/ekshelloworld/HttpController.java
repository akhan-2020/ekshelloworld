package com.akhan.hwk8s.ekshelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {

  //test controller
  @RequestMapping("/")
  public String home() {
    return "Hello Docker World";
  }
    
}
