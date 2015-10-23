package estate.pojo.response;

/**
 * Created by tangl9 on 2015-10-23.
 */

/**
 * 01：成功

 10：ID错误

 11：组织机构代码错误

 12：区县代码错误

 13：开发商ID不存在

 14：项目ID不存在

 15：预售方案ID不存在

 16：预售许可ID不存在

 17：监管资金协议ID不存在

 18：楼栋ID不存在

 19：房源ID不存在

 20：合同ID不存在

 21：日期格式错误

 22：数据格式错误

 23：合同备案编码已存在

 24：合同备案编码错误

 98：没有该用户

 99：其他错误

 */
public enum Message {
    CODE_01("成功"),

    CODE_10("ID错误"),

    CODE_11("组织机构代码错误"),

    CODE_12("区县代码错误"),

    CODE_13("开发商ID不存在"),

    CODE_14("项目ID不存在"),

    CODE_15("预售方案ID不存在"),

    CODE_16("预售许可ID不存在"),

    CODE_17("监管资金协议ID不存在"),

    CODE_18("楼栋ID不存在"),

    CODE_19("房源ID不存在"),

    CODE_20("合同ID不存在"),

    CODE_21("日期格式错误"),

    CODE_22("数据格式错误"),

    CODE_23("合同备案编码已存在"),

    CODE_24("合同备案编码错误"),

    CODE_98("没有该用户"),

    CODE_99("其他错误");


    private String msg;

    Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
