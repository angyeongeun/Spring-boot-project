package com.jojoldu.book.springboot.web;


import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {


    @GetMapping("/store") //2.HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 준다. @RequestMapping(method = RequestMethod.GET)사용 대체
    public String store(){
        return "Store";
    }


}
