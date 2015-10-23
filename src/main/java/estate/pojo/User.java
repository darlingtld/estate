package estate.pojo;

/**
 * Created by tangl9 on 2015-10-23.
 */

import javax.persistence.*;

/**
 * 系统用户表
 * <p>
 * 表名称：YCFC_SYS_USER
 * <p>
 * 序号	名称	字段名称	数据类型	是否为空	字段说明
 * 1	用户ID	USER_ID	INT	否	系统生成主键
 * 2	用户名	USER_NAME	VARCHAR(30)	否
 * 3	密码	USER_PASS	VARCHAR(50)	否	Md5加密
 * 4	真实姓名	USER_REALNAME	VARCHAR(30)	否
 * 5	区县代码	QXDM	CHAR(6)	否
 */
@Entity
@Table(name = "YCFC_SYS_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private int userid;
    @Column(name = "USER_NAME", length = 30, nullable = false)
    private String username;
    @Column(name = "USER_PASS", length = 50, nullable = false)
    private String userpass;
    @Column(name = "USER_REALNAME", length = 30, nullable = false)
    private String userrealname;
    @Column(name = "QXDM", length = 6, nullable = false)
    private String qxdm;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname;
    }

    public String getQxdm() {
        return qxdm;
    }

    public void setQxdm(String qxdm) {
        this.qxdm = qxdm;
    }
}
