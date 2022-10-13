package api.crud.repository.emprepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.crud.entity.empentity.EmpEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmpEntity, Integer>
{

}