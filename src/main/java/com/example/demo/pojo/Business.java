package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "商户对象",description = "商户对象的属性")
public class Business {

    @ApiModelProperty(value = "商户id",dataType = "int",required = true,example = "3")
    private Integer businessId;
    @ApiModelProperty(value = "商户姓名",dataType = "String",required = false,example = "肯德基")
    private String businessName;
    @ApiModelProperty(value = "商户地址",dataType = "String",required = false,example = "成都市新都区")
    private String businessAddress;
    @ApiModelProperty(value = "商户联系方式",dataType = "String",required = false,example = "12548978457")
    private String businessTell;
    @ApiModelProperty(value = "商户营业时间",dataType = "String",required = false,example = "09：00-20：00")
    private String businessServertime;
    @ApiModelProperty(value = "商户头像路径",dataType = "String",required = false,example = "04.jpg")
    private String businessImageurl;
    @ApiModelProperty(value = "商户介绍",dataType = "String",required = false,example = "你看这碗有大又圆，就像这面又长又宽")
    private String businessBusexplain;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessTell() {
        return businessTell;
    }

    public void setBusinessTell(String businessTell) {
        this.businessTell = businessTell;
    }

    public String getBusinessServertime() {
        return businessServertime;
    }

    public void setBusinessServertime(String businessServertime) {
        this.businessServertime = businessServertime;
    }

    public String getBusinessImageurl() {
        return businessImageurl;
    }

    public void setBusinessImageurl(String businessImageurl) {
        this.businessImageurl = businessImageurl;
    }

    public String getBusinessBusexplain() {
        return businessBusexplain;
    }

    public void setBusinessBusexplain(String businessBusexplain) {
        this.businessBusexplain = businessBusexplain;
    }

    @Override
    public String toString() {
        return "Business{" +
                "businessId=" + businessId +
                ", businessName='" + businessName + '\'' +
                ", businessAddress='" + businessAddress + '\'' +
                ", businessTell='" + businessTell + '\'' +
                ", businessServertime='" + businessServertime + '\'' +
                ", businessImageurl='" + businessImageurl + '\'' +
                ", businessBusexplain='" + businessBusexplain + '\'' +
                '}';
    }
}
