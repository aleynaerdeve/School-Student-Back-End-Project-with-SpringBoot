package com.aleyna.example.school;

//import jakarta.persistence.GeneratedValue;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//import java.util.stream.Collectors;

@RestController
public class SchoolController {
    //private final SchoolRepository schoolRepository;
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

 /*   public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }*/

    @PostMapping("/schools")
    public SchoolDto create(@RequestBody SchoolDto dto){
   /*     var school =toSchool(dto);
    var savedSchool= schoolRepository.save(school);*/
    return schoolService.create(dto);

}

/*    private School toSchool(SchoolDto dto) {
        return new School(dto.name());
    }
    private SchoolDto toSchoolDto(School school){
        return new SchoolDto(school.getName());
    }*/
    @GetMapping("/schools") //After finding student which will return list of schools
    public List<SchoolDto> findAlll(){
        return schoolService.findAlll();


/*        return schoolRepository.findAll()
                .stream()
                .map(this::toSchoolDto)
                .collect(Collectors.toList());*/
    } // Each element of this list of schools we perform a transformation
}
