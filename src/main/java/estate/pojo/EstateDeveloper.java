package estate.pojo;

/**
 * Created by tangl9 on 2015-10-23.
 */

import javax.persistence.*;

/**
 * 开发商

 表名称：YCFC_KFS

 说明：开发商ID是各个区县的开发商唯一标识，开发商ID+区县代码 可作为开发商的查询条件。

 序号	名称	字段名称	数据类型	是否为空	字段说明
 1	ID	ID	INT	否	系统生成主键
 2	开发商ID	KFSID	INT 	否	各个区县的开发商唯一标识
 3	开发商名称	KFSMC	VARCHAR(100)	否
 4	企业性质	KFSQXXZ	VARCHAR (60)	是
 5	组织机构代码	KFSZZJGDM	VARCHAR(60)	否
 6	开发商资质等级	KFSZZDJ	VARCHAR(60)	是
 7	资质等级证书编号	KFSZZDJSBH	VARCHAR(60)	是
 8	区县代码	QXDM	CHAR(6)	否	对应行政区划表
 9	入库时间	DJSJ	VARCHAR(12)	否	系统生成
 10	预留字段1	YL	VARCHAR(100)	是	预留字段，用不到可删除

 */
@Entity
@Table(name = "YCFC_KFS")
public class EstateDeveloper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "KFSID", nullable = false)
    private int kfsid;
    @Column(name = "KFSMC", length = 100, nullable = false)
    private String kfsmc;
    @Column(name = "KFSQYXZ", length = 60, nullable = true)
    private String kfsqyxz;
    @Column(name = "KFSZZJGDM", length = 60, nullable = false)
    private String kfszzjgdm;
    @Column(name = "KFSZZDJ", length = 60, nullable = true)
    private String kfszzdj;
    @Column(name = "KFSZZDJSBH", length = 60, nullable = true)
    private String kfszzdjsbh;
    @Column(name = "QXDM", length = 6, nullable = false)
    private String qxdm;
    @Column(name = "RKSJ", length = 12, nullable = false)
    private String rksj;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKfsid() {
        return kfsid;
    }

    public void setKfsid(int kfsid) {
        this.kfsid = kfsid;
    }

    public String getKfsmc() {
        return kfsmc;
    }

    public void setKfsmc(String kfsmc) {
        this.kfsmc = kfsmc;
    }

    public String getKfsqyxz() {
        return kfsqyxz;
    }

    public void setKfsqyxz(String kfsqyxz) {
        this.kfsqyxz = kfsqyxz;
    }

    public String getKfszzjgdm() {
        return kfszzjgdm;
    }

    public void setKfszzjgdm(String kfszzjgdm) {
        this.kfszzjgdm = kfszzjgdm;
    }

    public String getKfszzdj() {
        return kfszzdj;
    }

    public void setKfszzdj(String kfszzdj) {
        this.kfszzdj = kfszzdj;
    }

    public String getKfszzdjsbh() {
        return kfszzdjsbh;
    }

    public void setKfszzdjsbh(String kfszzdjsbh) {
        this.kfszzdjsbh = kfszzdjsbh;
    }

    public String getQxdm() {
        return qxdm;
    }

    public void setQxdm(String qxdm) {
        this.qxdm = qxdm;
    }

    public String getRksj() {
        return rksj;
    }

    public void setRksj(String rksj) {
        this.rksj = rksj;
    }
}
