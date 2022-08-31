package com.EdgeDeviceManagement.ProvisionPortal.Entity;


import com.EdgeDeviceManagement.ProvisionPortal.apps.App;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class SGW {

    @Id
    @GeneratedValue
    private Long id;
    private String serialNo;
    private String IP;
    private String state;

    //TODO: Figure out how to store this
//    private List<App> appList;


    @Override
    public String toString() {
        return "SGW{" +
                "id=" + id +
                ", serialNo='" + serialNo + '\'' +
                ", IP='" + IP + '\'' +
                ", state='" + state + '\'' +
//                ", appList=" + appList +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public String getIP() {
        return IP;
    }

    public String getState() {
        return state;
    }

//    public List<App> getAppList() {
//        return appList;
//    }

    public SGW(){

    }

    public SGW(
            String serialNo,
            String IP,
            String state
            ){
        this.serialNo=serialNo;
        this.IP=IP;
        this.state=state;
//        this.appList=null;
    }

}
