package kz.itstep.springboottest.repository.impl;

import kz.itstep.springboottest.data.LessonData;
import kz.itstep.springboottest.exception.LessonException;
import kz.itstep.springboottest.model.Lesson;
import kz.itstep.springboottest.repository.LessonRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class LessonRepositoryImpl implements LessonRepository {
    @Override
    public Optional<Lesson> get(Long id) {
        return LessonData.lessons.stream().filter(l->l.getId().equals(id)).findFirst();
    }
    @Override
    public void addNew(Lesson lesson) {
        if(LessonData.lessons.stream().anyMatch(l->l.getId().equals(lesson.getId()))){
            throw new LessonException("Lesson with id =" + lesson.getId()+" is present");
        }
        else {
            LessonData.lessons.add(lesson);
        }
    }
}
