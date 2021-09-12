package by.karpov.demo.service.impl;

import by.karpov.demo.dao.model.UserModel;
import by.karpov.demo.dao.repo.UserModelRepository;
import by.karpov.demo.service.UserModelService;
import by.karpov.demo.web.dto.UserData;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * UserModelServiceImpl.
 */
@Service
@Slf4j
public class UserModelServiceImpl implements UserModelService
{
	@Resource
	private UserModelRepository userModelRepo;

	@Override
	public UserModel addNewUser(final UserModel user)
	{
		log.info("UserModelServiceImpl.addNewUser()");
		return userModelRepo.save(user);
	}

	@Override
	public List<UserModel> getAll()
	{
		log.info("UserModelServiceImpl.getAll");
		 return userModelRepo.findAll();
	}
}
