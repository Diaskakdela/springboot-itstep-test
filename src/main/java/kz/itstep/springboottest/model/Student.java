package kz.itstep.springboottest.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Student {
    Long id;
    String name;
    Lesson lesson;
}
