package kz.itstep.springboottest.controllers;

import kz.itstep.springboottest.model.Lesson;
import kz.itstep.springboottest.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lessons")
@RequiredArgsConstructor
public class LessonController {
    private final LessonService lessonService;
    @GetMapping("/{id}")
    public Lesson getLessonById(@PathVariable Long id){
        return lessonService.get(id);
    }

    @GetMapping
    public List<Lesson> getAllLessons(){
        return lessonService.getAll();
    }
    @PostMapping
    public String saveLesson(@RequestBody Lesson lesson){
        lessonService.addNewLesson(lesson);
        return lesson + " added";
    }

    @PutMapping("/{id}")
    public Lesson putLesson(@PathVariable Long id, @RequestBody Lesson lesson){
        return lessonService.updateLessonById(id, lesson);
    }

    @DeleteMapping("/{name}")
    public void deleteLessonByName(@PathVariable String name){
        lessonService.deleteByName(name);
    }
    @DeleteMapping("/{id}")
    public void deleteLessonById(@PathVariable Long id, @RequestParam String s){

    }
}
