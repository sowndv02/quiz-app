package sowndv02.quiz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sowndv02.quiz.domain.Subject;
@Repository
public interface SubjectRepository extends CrudRepository<Subject, Integer>{
	List<Subject> findSubjectsByNameContaining(String name);
}
