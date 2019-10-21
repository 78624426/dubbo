package beans;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private static final long serialVersionUID=-1L;

    Integer id;
    String address;//用户地址
    String phoneNum;
    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public UserAddress(Integer id, String userId, String address, String phoneNum) {
        this.id = id;
        this.address = address;
        this.phoneNum = phoneNum;
        this.userId=userId;
    }

    public UserAddress() {
    }
}
