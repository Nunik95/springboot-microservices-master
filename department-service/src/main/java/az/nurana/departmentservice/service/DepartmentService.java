package az.nurana.departmentservice.service;

import az.nurana.departmentservice.dto.DepartmentDto;
import az.nurana.departmentservice.entity.Department;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);

}
