package sowndv02.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sowndv02.quiz.domain.Subject;
import sowndv02.quiz.repository.SubjectRepository;


@Service
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	private SubjectRepository subjectRepository;

	@Override
	public <S extends Subject> S save(S entity) {
		return subjectRepository.save(entity);
	}

	@Override
	public <S extends Subject> Iterable<S> saveAll(Iterable<S> entities) {
		return subjectRepository.saveAll(entities);
	}

	@Override
	public Optional<Subject> findById(Integer id) {
		return subjectRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return subjectRepository.existsById(id);
	}

	@Override
	public Iterable<Subject> findAll() {
		return subjectRepository.findAll();
	}

	@Override
	public Iterable<Subject> findAllById(Iterable<Integer> ids) {
		return subjectRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return subjectRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		subjectRepository.deleteById(id);
	}

	@Override
	public void delete(Subject entity) {
		subjectRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		subjectRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Subject> entities) {
		subjectRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		subjectRepository.deleteAll();
	}

	@Override
	public List<Subject> findSubjectsByNameContaining(String name) {
		return subjectRepository.findSubjectsByNameContaining(name);
	}
	
	

}
