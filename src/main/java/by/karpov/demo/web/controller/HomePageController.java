package by.karpov.demo.web.controller;

import by.karpov.demo.dao.model.UserModel;
import by.karpov.demo.dao.repo.UserModelRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller()
public class HomePageController
{
	@Resource
	private UserModelRepository userRepo;

	@ModelAttribute(name = "newUser")
	public UserModel getNewUser()
	{
		return new UserModel();
	}

	@GetMapping("/")
	public String showHome(Model model)
	{
		List<UserModel> users = userRepo.findAll();

		if (!users.isEmpty())
		{
			model.addAttribute("userList", users);
		}
		return "home";
	}

	@PostMapping("/")
	public String addUser(@ModelAttribute UserModel user)
	{
		userRepo.save(user);
		return "redirect:";
	}
}
