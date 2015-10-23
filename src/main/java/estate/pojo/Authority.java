package estate.pojo;

/**
 * Created by tangl9 on 2015-10-23.
 */

import javax.persistence.*;

/**
 * 系统权限表

 表名称：YCFC_SYS_AUTHORITY

 序号	名称	字段名称	数据类型	是否为空	字段说明
 1	ID	ID	INT	否	系统生成主键
 2	角色ID	ROLE_ID	INT	否
 3	菜单ID	MENU_ID	INT	否

 */
@Entity
@Table(name="YCFC_SYS_AUTHORITY")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "ROLE_ID", nullable = false)
    private String roleid;
    @Column(name = "MENU_ID", nullable = false)
    private String menuid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }
}
