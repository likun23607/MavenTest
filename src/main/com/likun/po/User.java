package likun.po;


import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/29.
 */
public class User  implements Serializable {
    private static final long serialVersionUID = -7898194272883238670L;

    public static final String OBJECT_KEY = "USER";

    private String name;
    private String sex;
    private String addr;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getObjectKey() {
        return OBJECT_KEY;
    }


}
