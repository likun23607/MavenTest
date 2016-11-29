package likun.po;

import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by Administrator on 2016/11/29.
 */
//@Document
public class Order {
    @Id
    private String id;
  //  @Field("client")
    private String customer;

    private String type;

    private Collection<Item> items=new LinkedHashSet<Item>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }
}
