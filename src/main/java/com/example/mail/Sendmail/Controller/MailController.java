package com.example.mail.Sendmail.Controller;

import com.example.mail.Sendmail.Service.MailSendService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MailController {

    private final MailSendService mailSendService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/send-mail")
    public String sendMail() {
        String to = "example@example.com";
        String subject = "메일 제목";
        String body = "메일 본문 내용";
        mailSendService.sendMail(to, subject, body);
        return "redirect:/";
    }
}
