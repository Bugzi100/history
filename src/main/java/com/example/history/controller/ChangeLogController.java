package com.example.history.controller;

import com.example.history.model.ChangeLog;
import com.example.history.service.ChangeLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/changelog")
public class ChangeLogController {

    @Autowired
    private ChangeLogService changeLogService;

    @GetMapping
    public List<ChangeLog> getAllChangeLogs() {
        return changeLogService.getAllChangeLogs();
    }

    @PostMapping
    public ChangeLog logChange(@RequestParam String entityName,
                               @RequestParam Long entityId,
                               @RequestParam String changeType) {
        return changeLogService.logChange(entityName, entityId, changeType);
    }

}
