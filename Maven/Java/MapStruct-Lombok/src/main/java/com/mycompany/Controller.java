package com.mycompany;

import com.mycompany.mapper.SourceTargetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = Controller.USER_URI)
@RestController
@RequiredArgsConstructor
public class Controller {

    public static final String USER_URI = "test";
    private final SourceTargetMapper sourceTargetMapper;

    @GetMapping
    public String test() {
        Source s = new Source();
        s.setTest("5");
        Target t = sourceTargetMapper.toTarget(s);
        return String.valueOf(t.getTesting());
    }
}
