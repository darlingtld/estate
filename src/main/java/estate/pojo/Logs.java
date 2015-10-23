package estate.pojo;

/**
 * Created by tangl9 on 2015-10-23.
 */

import javax.persistence.*;

/**
 * 系统日志表
 * <p>
 * 表名称：YCFC_SYS_LOGS
 * <p>
 * 序号	名称	字段名称	数据类型	是否为空	字段说明
 * 1	ID	ID	INT	否	系统生成主键
 * 2	用户ID	USER_ID	INT	否
 * 3	登陆IP	LOGIN_IP	VARCHAR(30)	否
 * 4	操作时间	CZSJ	VARCHAR(30)	否
 * 5	操作类型	CZLX	VARCHAR(50)	否
 */
@Entity
@Table(name = "YCFC_SYS_LOGS")
public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "USER_ID", nullable = false)
    private int userid;
    @Column(name = "LOGIN_IP", length = 30, nullable = false)
    private String loginip;
    @Column(name = "CZSJ", length = 30, nullable = false)
    private String czsj;
    @Column(name = "CZLX", length = 50, nullable = false)
    private String czlx;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public String getCzsj() {
        return czsj;
    }

    public void setCzsj(String czsj) {
        this.czsj = czsj;
    }

    public String getCzlx() {
        return czlx;
    }

    public void setCzlx(String czlx) {
        this.czlx = czlx;
    }
}
