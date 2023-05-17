package kz.itstep.springboottest.controllers;

import kz.itstep.springboottest.model.Lesson;
import kz.itstep.springboottest.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lessons")
@RequiredArgsConstructor
public class LessonController {
    private final LessonService lessonService;
    @GetMapping("/{id}")
    public Lesson getLessonById(@PathVariable Long id){
        return lessonService.get(id);
    }
    @PostMapping
    public String saveLesson(@RequestBody Lesson lesson){
        lessonService.addNewLesson(lesson);

        return lesson+" added";
    }
}
