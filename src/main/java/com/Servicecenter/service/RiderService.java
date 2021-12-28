package com.Servicecenter.service;

import com.Servicecenter.model.Rider;

public interface RiderService {
    public RiderService register();
    public Boolean login();
    public RiderService editRider(int id, Rider rider);


}
