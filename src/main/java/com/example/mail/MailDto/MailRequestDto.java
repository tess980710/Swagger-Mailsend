package com.example.mail.MailDto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MailRequestDto {
    private String writer;
    private String title;
    private String content;
    private String toEmail;
}
