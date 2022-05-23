package com.enigma.EnigmaREST.mappers;

import com.enigma.EnigmaREST.beans.DeviceInfo;
import com.enigma.EnigmaREST.beans.JsonDeviceInfo;

public class Mapper {
    public static DeviceInfo mapDeviceInfo(JsonDeviceInfo jsonDeviceInfo) {
        return new DeviceInfo(null, jsonDeviceInfo.getLatitude(), jsonDeviceInfo.getLongitude());
    }
}
