package com.example.demo.vo;

/*
* 向前端返回需要的结果
* */
public class ResultVo {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    private ResultVo(){}

//    成功
    public static ResultVo ok(Object data) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(200);
        resultVo.setMsg("ok");
        resultVo.setData(data);
        return resultVo;
    }
    public static ResultVo ok(){

        return ResultVo.ok(null);
    }
//    失败
    public static ResultVo error(Object data){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(500);
        resultVo.setMsg("error");
        resultVo.setData(data);
        return resultVo;
    }
}
