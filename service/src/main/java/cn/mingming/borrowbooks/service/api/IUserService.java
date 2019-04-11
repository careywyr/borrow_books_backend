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
}
