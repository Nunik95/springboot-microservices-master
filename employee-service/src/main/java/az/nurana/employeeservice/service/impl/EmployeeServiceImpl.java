package az.nurana.employeeservice.service.impl;

import az.nurana.employeeservice.dto.EmployeeDto;
import az.nurana.employeeservice.entity.Employee;
import az.nurana.employeeservice.repo.EmployeeRepo;
import az.nurana.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private ModelMapper modelMapper;

    private EmployeeRepo employeeRepo;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto){
        Employee employee=modelMapper.map(employeeDto, Employee.class);
        Employee savedEmployee=employeeRepo.save(employee);
        EmployeeDto savedEmployeeDto=modelMapper.map(savedEmployee, EmployeeDto.class);
        return savedEmployeeDto;
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee=employeeRepo.findById(employeeId).get();
        EmployeeDto employeeDto=modelMapper.map(employee, EmployeeDto.class);
        return employeeDto;
    }
}
