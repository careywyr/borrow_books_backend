package cn.mingming.borrowbooks.web.controller;


import cn.mingming.borrowbooks.service.dto.UserDTO;
import cn.mingming.borrowbooks.service.common.ResponseDto;
import cn.mingming.borrowbooks.service.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping("/register")
    public ResponseDto register(@RequestBody UserDTO userDTO){
        String errors = userService.register(userDTO);
        return ResponseDto.instance(errors);
    }

    @PostMapping("/login")
    public ResponseDto login(@RequestBody UserDTO userDTO){
        String errors = userService.login(userDTO);
        return ResponseDto.instance(errors);
    }
}

