package sowndv02.quiz.service;

import java.util.List;
import java.util.Optional;

import sowndv02.quiz.domain.Subject;

public interface SubjectService{

	void deleteAll();

	void deleteAll(Iterable<? extends Subject> entities);

	void deleteAllById(Iterable<? extends Integer> ids);

	void delete(Subject entity);

	void deleteById(Integer id);

	long count();

	Iterable<Subject> findAllById(Iterable<Integer> ids);

	Iterable<Subject> findAll();

	boolean existsById(Integer id);

	Optional<Subject> findById(Integer id);

	<S extends Subject> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Subject> S save(S entity);

	List<Subject> findSubjectsByNameContaining(String name);
}
