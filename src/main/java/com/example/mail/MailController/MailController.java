package com.example.mail.MailController;


import com.example.mail.MailDto.MailRequestDto;
import com.example.mail.MailService.MailSendService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
@Tag(name = "메일 api", description = "메일 송신 api")
@RequiredArgsConstructor
public class MailController {

    private final MailSendService mailSendService;

    @PostMapping("/send")
    @Operation(summary = "메일전송", description = "메일을 전송합니다.")
    public ResponseEntity<String> sendMail(@RequestBody MailRequestDto mailRequestDto){
        mailSendService.sendMail(mailRequestDto);
        return ResponseEntity.ok("메일 전송 성공");
    }
}
