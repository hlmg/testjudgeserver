package com.example.testjudgeserver.judge.domain;

import java.util.List;
import lombok.Getter;

// TODO: 채점 기능에서 활용할 임시 클래스
@Getter
public class Problem {
    public List<Hiddencase> hiddencases;
    public List<String> inputTypes;
    public String outputType;

    public Problem(List<Hiddencase> hiddencases, List<String> inputTypes, String outputType) {
        this.hiddencases = hiddencases;
        this.inputTypes = inputTypes;
        this.outputType = outputType;
    }
}
