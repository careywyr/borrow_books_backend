package cn.mingming.borrowbooks.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author carey
 * @date 2019/4/11
 */
@Entity
@Table(name = "user", schema = "borrow_books", catalog = "")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
