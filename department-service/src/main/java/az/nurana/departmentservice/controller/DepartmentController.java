package az.nurana.departmentservice.controller;


import az.nurana.departmentservice.dto.DepartmentDto;
import az.nurana.departmentservice.entity.Department;
import az.nurana.departmentservice.service.DepartmentService;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;


    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody
                                                        DepartmentDto departmentDto) {

        DepartmentDto savedDepartmentDto = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartmentDto, HttpStatus.CREATED);

    }

    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable(name = "department-code")
                                                       String departmentCode) {
        DepartmentDto getDepartmentDto = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(getDepartmentDto, HttpStatus.OK);
    }
}
