package com.example.testjudgeserver.judge.dto;

import com.example.testjudgeserver.judge.domain.Language;
import lombok.Getter;

@Getter
public class JudgeRequest {
    private Language language;
    private String code;
}
