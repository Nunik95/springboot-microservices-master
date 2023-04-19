package az.nurana.employeeservice.service;

import az.nurana.employeeservice.dto.ApiResponseDto;
import az.nurana.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    public EmployeeDto saveEmployee(EmployeeDto employeeDto);

    public ApiResponseDto getEmployeeById(Long employeeId);

}
