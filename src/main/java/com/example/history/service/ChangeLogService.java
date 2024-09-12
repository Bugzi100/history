package com.example.history.service;

import com.example.history.model.ChangeLog;
import com.example.history.repository.ChangeLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ChangeLogService {

    @Autowired
    private ChangeLogRepository changeLogRepository;

    public List<ChangeLog> getAllChangeLogs() {
        return changeLogRepository.findAll();
    }

    public ChangeLog logChange(String entityName, Long entityId, String changeType) {
        ChangeLog changeLog = new ChangeLog();
        changeLog.setEntityName(entityName);
        changeLog.setEntityId(entityId);
        changeLog.setChangeType(changeType);
        changeLog.setChangeTimeStamp(Instant.now());
        return changeLogRepository.save(changeLog);
    }

}
