package com.example.testjudgeserver.judge.domain.creator;

import java.util.List;

public interface RuntimeEnvironmentCreator {
    void create(List<String> inputTypes, String code, String route);
}
