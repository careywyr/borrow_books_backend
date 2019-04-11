package cn.mingming.borrowbooks.web.controller;


import cn.mingming.borrowbooks.service.dto.UserDTO;
import cn.mingming.borrowbooks.service.common.ResponseDto;
import cn.mingming.borrowbooks.service.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author carey
 * @since 2019-04-11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/queryAllUsers")
    public ResponseDto queryAllUsers(){
        List<UserDTO> userVOS = userService.queryAllUsers();
        return ResponseDto.instance(userVOS);
    }
}

