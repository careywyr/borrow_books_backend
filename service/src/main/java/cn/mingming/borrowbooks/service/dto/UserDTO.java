package cn.mingming.borrowbooks.service.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author carey
 * @date 2019/4/11
 */
@Data
public class UserDTO {
    private Long id;

    private String userName;

    private String email;

    private String password;

    private Integer isDeleted;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;
}
