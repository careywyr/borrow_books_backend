package cn.mingming.borrowbooks.service.api.impl;

import cn.mingming.borrowbooks.service.api.IUserService;
import cn.mingming.borrowbooks.service.dto.UserDTO;
import cn.mingming.borrowbooks.service.utils.BeanConverter;
import cn.mingming.borrowbooks.dao.entity.User;
import cn.mingming.borrowbooks.dao.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author carey
 * @since 2019-04-11
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> queryAllUsers(){
        List<User> users = userMapper.selectList(null);
        return BeanConverter.convertList(users, UserDTO.class);
    }

}
