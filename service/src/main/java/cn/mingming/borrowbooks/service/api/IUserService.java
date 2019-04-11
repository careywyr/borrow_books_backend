package cn.mingming.borrowbooks.service.api;

import cn.mingming.borrowbooks.service.dto.UserDTO;

import java.util.List;

/**
 * @author carey
 * @date 2019/4/11
 */
public interface IUserService {

    /**
     * @return
     */
    List<UserDTO> queryAllUsers();

    /**
     * 保存用户
     * @param userDTO
     * @return
     */
    void saveUser(UserDTO userDTO);

    /**
     * 注册
     * @param userDTO
     * @return
     */
    String register(UserDTO userDTO);

    /**
     * 登陆
     * @param userDTO
     * @return
     */
    String login(UserDTO userDTO);
}
