package sowndv02.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sowndv02.quiz.domain.Subject;
import sowndv02.quiz.exception.SubjectNotFoundException;
import sowndv02.quiz.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	
	@GetMapping()
	public List<Subject> getAll() {
		return (List<Subject>) subjectService.findAll();
	}
	
	@GetMapping("/{name}/find")
	public List<Subject> findByName(String name){
		return subjectService.findSubjectsByNameContaining(name);
	}
	
	
	@GetMapping("/{id}/get")
	public Subject get(@PathVariable Integer id) {
		Subject subject = subjectService.findById(id).orElseThrow(() -> new SubjectNotFoundException());
		return subject;
	}
	
	@PostMapping("")
	public Subject insert(@RequestBody Subject subject) {
		return subjectService.save(subject);
	}
	
	@PutMapping("/{id}/update")
	public Subject update(@PathVariable Integer id, @RequestBody Subject subject) {
		return subjectService.findById(id).map(sub -> {
			sub.setName(subject.getName());
			sub.setLogo(subject.getLogo());
			return subjectService.save(sub);
		}).get();
	}
	
	
	
}
