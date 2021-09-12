package by.karpov.demo.web.controller;

import by.karpov.demo.dao.model.UserModel;
import by.karpov.demo.service.UserModelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller()
public class HomePageController
{
	@Resource
	private UserModelService userService;

	@ModelAttribute(name = "newUser")
	public UserModel getNewUser()
	{
		return new UserModel();
	}

	@GetMapping("/")
	public String showHome(Model model)
	{
		log.info("GET /");
		List<UserModel> users = userService.getAll();

		if (!users.isEmpty())
		{
			model.addAttribute("userList", users);
		}
		return "home";
	}

	@PostMapping("/")
	public String addUser(@ModelAttribute UserModel user)
	{
		log.info("POST /");
		userService.addNewUser(user);
		return "redirect:";
	}
}
