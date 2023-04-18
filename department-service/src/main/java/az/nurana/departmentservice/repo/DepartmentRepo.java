package az.nurana.departmentservice.repo;

import az.nurana.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
    Department findByDepartmentCode(String departmentCode);
}
