package kz.itstep.springboottest.repository.impl;

import kz.itstep.springboottest.model.Lesson;
import kz.itstep.springboottest.repository.LessonRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LessonRepoWithJDBCImpl implements LessonRepository {
    @Override
    public Optional<Lesson> get(Long id) {
        return Optional.empty();
    }

    @Override
    public void addNew(Lesson lesson) {

    }

    @Override
    public Lesson updateLessonById(Long id, Lesson lesson) {
        return null;
    }

    @Override
    public void deleteAllByName(String name) {

    }

    @Override
    public List<Lesson> getAll() {
        return null;
    }
}
