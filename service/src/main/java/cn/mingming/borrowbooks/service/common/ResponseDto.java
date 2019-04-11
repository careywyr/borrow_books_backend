package cn.mingming.borrowbooks.service.common;

import lombok.Data;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/4 14:46
 */
@Data
public class ResponseDto {

    /**返回代码**/
    private String code;
    /**返回结果**/
    private String resultMsg;
    /**返回数据**/
    private Object data;

    public ResponseDto(String code, String resultMsg, Object data) {
        this.code = code;
        this.resultMsg = resultMsg;
        this.data = data;
    }

    private ResponseDto(Object data){
        this.code ="0000";
        this.resultMsg ="成功";
        this.data = data;
    }

    public ResponseDto() {
    }

    public static ResponseDto instance(Object data){
        return new ResponseDto(data);
    }
}
