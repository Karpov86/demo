package by.karpov.demo.service;

import by.karpov.demo.dao.model.UserModel;

import java.util.List;

/**
 * UserModelService.
 */
public interface UserModelService
{
	/**
	 * Adds new user.
	 *
	 * @param user {@link UserModel}
	 * @return return new user.
	 */
	UserModel addNewUser(UserModel user);

	/**
	 * Gets list of {@link UserModel}.
	 *
	 * @return list of {@link UserModel}
	 */
	List<UserModel> getAll();
}
