package estate.pojo;

/**
 * Created by tangl9 on 2015-10-23.
 */

import javax.persistence.*;

/**
 * 系统菜单表
 * <p>
 * 表名称：YCFC_SYS_MENU
 * <p>
 * 序号	名称	字段名称	数据类型	是否为空	字段说明
 * 1	菜单ID	MENU_ID	INT	否	系统生成主键
 * 2	菜单名称	MENU_NAME	VARCHAR(30)	否
 * 3	菜单地址	MENU_TARGET	VARCHAR(100)	否
 * 4	父菜单ID	MENU_PARENT	INT	否
 * 5	是否有下级	MENU_TYPE	INT	否
 */
@Entity
@Table(name = "YCFC_SYS_MENU")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MENU_ID")
    private int menuid;
    @Column(name = "MENU_NAME", length = 30, nullable = false)
    private String menuname;
    @Column(name = "MENU_TARGET", length = 100, nullable = false)
    private String menutarget;
    @Column(name = "MENU_PARENT", nullable = false)
    private int menuparent;
    @Column(name = "MENU_TYPE", nullable = false)
    private int menutype;

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenutarget() {
        return menutarget;
    }

    public void setMenutarget(String menutarget) {
        this.menutarget = menutarget;
    }

    public int getMenuparent() {
        return menuparent;
    }

    public void setMenuparent(int menuparent) {
        this.menuparent = menuparent;
    }

    public int getMenutype() {
        return menutype;
    }

    public void setMenutype(int menutype) {
        this.menutype = menutype;
    }
}
