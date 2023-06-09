package az.nurana.employeeservice.controller;


import az.nurana.employeeservice.dto.ApiResponseDto;
import az.nurana.employeeservice.dto.EmployeeDto;
import az.nurana.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeServiceController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity <EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployeeDto = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployeeDto, HttpStatus.CREATED);
    }

    @GetMapping("{employee-id}")
    public ResponseEntity <ApiResponseDto> getEmployee(@PathVariable("employee-id") Long id) {
        ApiResponseDto apiResponseDto=employeeService.getEmployeeById(id);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }

}
