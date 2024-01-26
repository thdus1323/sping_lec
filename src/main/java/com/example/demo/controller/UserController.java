package com.example.demo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@RestController // 리턴 시에 그 문자를 그대로 응답.
@Controller // 리턴 시에 파일을 응답(포워드해주는 애.)
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";

    }

    @PostMapping("/join")
    public String join(String username, String password, String email, HttpServletResponse response) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");

        System.out.println("username :" + username);
        System.out.println("password :" + password);
        System.out.println("email :" + email);

        //1
        if (username.length() > 10) {
            return "error-404";
        }

        //2
        return "main";
    }
}
