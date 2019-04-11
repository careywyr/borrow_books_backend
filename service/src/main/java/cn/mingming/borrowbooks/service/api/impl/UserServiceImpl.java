package cn.mingming.borrowbooks.service.api.impl;

import cn.mingming.borrowbooks.dao.entity.UserEntity;
import cn.mingming.borrowbooks.dao.repository.UserRespository;
import cn.mingming.borrowbooks.service.api.IUserService;
import cn.mingming.borrowbooks.service.dto.UserDTO;
import cn.mingming.borrowbooks.service.enums.IsDeletedEnum;
import cn.mingming.borrowbooks.service.utils.BeanConverter;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    private UserRespository userRespository;

    @Override
    public List<UserDTO> queryAllUsers(){
        List<UserEntity> users = userRespository.findAll();
        return BeanConverter.convertList(users, UserDTO.class);
    }

    @Override
    public void saveUser(UserDTO userDTO){
        log.info("save User, userDTO={}", JSONObject.toJSONString(userDTO));
        UserEntity userEntity = BeanConverter.convertOne(userDTO, UserEntity.class);
        if(null == userEntity.getId()){
            userEntity.setCreateTime(new Date());
            userEntity.setCreateBy("sys");
            userEntity.setIsDeleted(IsDeletedEnum.UNDELETE.getId());
        }
        userEntity.setUpdateTime(new Date());
        userEntity.setUpdateBy("sys");
        userRespository.save(userEntity);
    }

    @Override
    public String register(UserDTO userDTO){
        log.info("register, userDTO={}", JSONObject.toJSONString(userDTO));
        if(StringUtils.isBlank(userDTO.getEmail())){
            return "请填写邮箱";
        }
        if(StringUtils.isBlank(userDTO.getPassword())){
            return "请填写密码";
        }
        UserEntity userEntity = userRespository.findByEmailAndPasswordAndIsDeleted(userDTO.getEmail(), userDTO.getPassword(), IsDeletedEnum.UNDELETE.getId());
        if(null != userEntity){
            return "账号已存在！";
        }
        saveUser(userDTO);
        return null;
    }

    @Override
    public String login(UserDTO userDTO){
        log.info("user login, userDto={}",JSONObject.toJSONString(userDTO));
        UserEntity userEntity = userRespository.findByEmailAndPasswordAndIsDeleted(userDTO.getEmail(), userDTO.getPassword(), IsDeletedEnum.UNDELETE.getId());
        if(null == userEntity){
            log.error("邮箱或密码错误！");
            return "邮箱或密码错误！";
        }
        //todo 缓存
        return null;
    }

}
