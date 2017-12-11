package com.saltyfish.querytickets.service.serviceimpl;

import com.saltyfish.querytickets.dao.TrainStationDao;
import com.saltyfish.querytickets.model.TrainStationEntity;
import com.saltyfish.querytickets.service.TrainStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainStationServiceImpl implements TrainStationService {

    @Autowired
    private TrainStationDao trainStationDao;

    public List<TrainStationEntity> getAll() {
        List<TrainStationEntity> trainStationEntities = trainStationDao.getAll();
        if (trainStationEntities != null)
            return trainStationEntities;
        else
            return null;
    }
}
