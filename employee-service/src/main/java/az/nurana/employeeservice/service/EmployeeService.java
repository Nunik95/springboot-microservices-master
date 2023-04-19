package az.nurana.employeeservice.service;

import az.nurana.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    public EmployeeDto saveEmployee(EmployeeDto employeeDto);

    public EmployeeDto getEmployeeById(Long employeeId);

}
