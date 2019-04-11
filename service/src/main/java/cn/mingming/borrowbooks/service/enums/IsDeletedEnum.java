package cn.mingming.borrowbooks.service.enums;

/**
 * @author carey
 * @date 2019/3/26
 */
public enum IsDeletedEnum {

    /**
     *
     */
    UNDELETE(0, "正常"),
    DELETE(1, "删除");

    private Integer id;
    private String name;

    private IsDeletedEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
