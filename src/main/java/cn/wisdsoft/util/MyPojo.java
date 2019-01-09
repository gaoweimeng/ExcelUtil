package cn.wisdsoft.util;

import java.util.Date;

/**
 * @Author 高伟萌
 * @Date 2018/10/22 08:18
 * @Description TODO
 */
public class MyPojo {
    private Double name;
    private String password;
    private Date mydate;
    private int sex;

    public Date getMydate() {
        return mydate;
    }

    public void setMydate(Date mydate) {
        this.mydate = mydate;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Double getName() {
        return name;
    }

    public void setName(Double name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
