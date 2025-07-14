package com.example.mail.MailService;

import com.example.mail.MailDto.MailRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailSendService {
    private final JavaMailSender mailSender;

    public void sendMail(MailRequestDto mailRequestDto){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mailRequestDto.getToEmail());  // 받는 사람 이메일
        message.setSubject(mailRequestDto.getTitle());
        message.setText(mailRequestDto.getContent());
        mailSender.send(message);
    }

}

