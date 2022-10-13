package api.crud.service.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.crud.dto.userdto.userDto;
import api.crud.entity.userentity.userEntity;
import api.crud.repository.userrepository.userRepository;

@Service
public class userService {
	@Autowired
	userRepository empRepository;
	
	public void insert(userDto dto)
	{
		System.out.println("inserting data");
		userEntity entity = new userEntity();
		entity.setName(dto.getName());
		entity.setCity(dto.getCity());
		entity.setPhone(dto.getPhone());
		entity.setU_id(dto.getU_id());

		System.out.println(empRepository.save(entity));
	}
}
