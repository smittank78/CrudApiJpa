package api.crud.service.empservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.crud.dto.empdto.EmployeeDto;
import api.crud.entity.empentity.EmpDetailEntity;
import api.crud.entity.empentity.EmpEntity;
import api.crud.repository.emprepository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository repository;

	public void insert(EmployeeDto dto)
	{
		EmpDetailEntity detailEntity = new EmpDetailEntity();
		detailEntity.setId(1);
//		detailEntity.setEmpEntity(dto.getDetailDto().getEmp_id());
		detailEntity.setD_id(dto.getDetailDto().getD_id());
		detailEntity.setQ_id(dto.getDetailDto().getQ_id());
		
		List<EmpDetailEntity> detailList = new ArrayList<>();
		detailList.add(detailEntity);
		
		EmpEntity empEntity = new EmpEntity();
		//empEntity.setId(dto.getId());
		empEntity.setE_id(dto.getE_id());
		empEntity.setName(dto.getE_name());
		empEntity.setCity(dto.getE_name());
		empEntity.setPhone(dto.getE_phone());
		empEntity.setDetailEntity(detailList);
		
		System.out.println("data added in entity");
		System.out.println(repository.save(empEntity));
		System.out.println("data inserted");
	}
}