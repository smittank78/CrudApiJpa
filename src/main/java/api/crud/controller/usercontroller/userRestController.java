package api.crud.controller.usercontroller;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import api.crud.dto.userdto.userDto;
import api.crud.service.userservice.userService;

@RestController
public class userRestController 
{
	@Autowired
	userService service;
	
	@Autowired
	org.springframework.core.env.Environment environment;
	
	@GetMapping("/")
	public String homePage()
	{
		System.out.println("data calling...");
		userDto dto = new userDto();
		dto.setId(Integer.parseInt(environment.getProperty("student.id")));
		dto.setName(environment.getProperty("student.name"));
		dto.setCity(environment.getProperty("student.city"));
		dto.setActive(true);
		dto.setPhone(Integer.parseInt(environment.getProperty("student.phone")));
		dto.setU_id(Integer.parseInt(environment.getProperty("student.uid")));
		
		service.insert(dto);
		
		return "home";
	}
}