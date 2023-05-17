package kz.itstep.springboottest.repository;

import kz.itstep.springboottest.model.Lesson;

import java.util.Optional;

public interface LessonRepository {
    Optional<Lesson> get(Long id);
    void addNew(Lesson lesson);
}
