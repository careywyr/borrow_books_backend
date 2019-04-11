package cn.mingming.borrowbooks.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author carey
 * @since 2019-04-11
 */
@Data
public class User implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userName;

    private String email;

    private String password;

    private Integer isDeleted;

    private LocalDate createTime;

    private String createBy;

    private LocalDate updateTime;

    private String updateBy;
}
