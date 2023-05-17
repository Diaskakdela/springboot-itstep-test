package kz.itstep.springboottest.data;

import kz.itstep.springboottest.model.Lesson;

import java.util.ArrayList;
import java.util.List;

public class LessonData {
    public static List<Lesson> lessons = List.of(new Lesson(1L,"math"), new Lesson(2L,"english"));
}
