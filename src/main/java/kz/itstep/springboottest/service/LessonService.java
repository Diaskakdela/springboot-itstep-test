package kz.itstep.springboottest.service;

import kz.itstep.springboottest.exception.LessonException;
import kz.itstep.springboottest.model.Lesson;
import kz.itstep.springboottest.repository.LessonRepository;
import kz.itstep.springboottest.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonService {
    private final LessonRepository lessonRepository;
    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public Lesson get(Long id){
//        Optional<Lesson> lesson = lessonRepository.get(id);
//        if(lesson.isEmpty()){
//            throw new LessonException("no lessons with id= "+id);
//        }
//        return lesson.get();

        return lessonRepository.get(id).orElseThrow(()->new LessonException("no lessons with id= "+id));
    }

    public void addNewLesson(Lesson lesson){
        lessonRepository.addNew(lesson);
    }
}

