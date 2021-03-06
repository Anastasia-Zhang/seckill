package com.miaoshaProject.error;

public enum EmBusinessError implements CommonError {
    //10001 通用错误类型
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    //00002 未知错误
    UNKNOWN_ERROR(10002,"未知错误"),
    //20000开头为用户信息相关定义
    USER_NOT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FAILD(20002,"用户手机号或密码不正确"),
    USER_NOT_LOGIN(20003,"用户未登录"),
    //30000为交易信息错误
    STOCK_NOT_ENOUGH(30001,"商品库存不足"),
    //40000为购物车错误
    SHOPCAR_NOT_EXIST(40001,"用户购物车不存在"),
    SHOPCAR_IS_EMPTY(40002,"用户购物车为空"),
    //50000为订单相关错误
    OREDER_NOT_EXIST(50001,"订单不存在"),
    //60000为评论错误
    COMMENT_IS_NULL(60001,"评论不能为空"),


    ;

    private EmBusinessError(int errCode,String errMsg)
    {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;
    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    //有一个通用错误类型，但是在不同场景下通用错误类型不同，如用户名没有输入、邮箱格式不合法等等都属于参数类型不合法此时需要定义一个接口接受不同实现（多态）
    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;//返回当前对象引用
    }


}
