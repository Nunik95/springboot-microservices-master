package az.nurana.departmentservice.service.impl;

import az.nurana.departmentservice.dto.DepartmentDto;
import az.nurana.departmentservice.entity.Department;
import az.nurana.departmentservice.repo.DepartmentRepo;
import az.nurana.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private ModelMapper modelMapper;
    private DepartmentRepo departmentRepo;


    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department=modelMapper.map(departmentDto, Department.class);
        Department savedDepartment=departmentRepo.save(department);
        DepartmentDto savedDepartmentDto=modelMapper.map(savedDepartment, DepartmentDto.class);
        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepo.findByDepartmentCode(departmentCode);
        DepartmentDto departmentDto = modelMapper.map(department, DepartmentDto.class);
        return departmentDto;
    }
}
