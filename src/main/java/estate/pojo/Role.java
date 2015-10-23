package estate.pojo;

/**
 * Created by tangl9 on 2015-10-23.
 */

import javax.persistence.*;

/**
 * 系统角色表

 表名称：YCFC_SYS_ROLE


 序号	名称	字段名称	数据类型	是否为空	字段说明
 1	用户ID	USER_ID	INT	否	系统生成主键
 2	角色	USER_ROLE	VARCHAR(30)	否


 */
@Entity
@Table(name="YCFC_SYS_ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private int userid;
    @Column(name = "USER_ROLE", length = 30, nullable = false)
    private String userrole;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }
}
