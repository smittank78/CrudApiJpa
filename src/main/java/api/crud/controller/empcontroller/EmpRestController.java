package api.crud.controller.empcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.crud.dto.empdto.EmployeeDetailDto;
import api.crud.dto.empdto.EmployeeDto;
import api.crud.service.empservice.EmployeeService;

@RestController
@RequestMapping("/emp/")
public class EmpRestController 
{
	@Autowired
	EmployeeService service;
	
	@GetMapping("/")
	public String home()
	{

		EmployeeDetailDto detailDto = new EmployeeDetailDto();
		detailDto.setD_id(1);
		detailDto.setQ_id(2);

		EmployeeDto dto = new EmployeeDto();
		dto.setDetailDto(detailDto);
		dto.setE_id(1);
		dto.setE_name("smit");
		dto.setE_city("ahmedabad");
		dto.setE_active(true);
		dto.setE_phone(172);
		
		service.insert(dto);
		
		System.out.println(dto.toString());
		return "employee called";
	}
}