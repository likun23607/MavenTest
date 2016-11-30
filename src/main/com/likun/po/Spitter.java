package likun.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/24.
 */

public class Spitter implements Serializable{
    private static final long serialVersionUID = 21287917233879L;
    private String name;

    private String sex;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
