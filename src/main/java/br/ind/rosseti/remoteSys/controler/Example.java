package br.ind.rosseti.remoteSys.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class Example {
	
   @RequestMapping("/xas")
   @ResponseBody
   public String hello() {
      return "Hello Spring Boot";
   }
}
