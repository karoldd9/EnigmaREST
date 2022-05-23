package com.enigma.EnigmaREST.repositories;

import com.enigma.EnigmaREST.beans.DeviceInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceInfoRepository extends JpaRepository<DeviceInfo, Integer> {
}
