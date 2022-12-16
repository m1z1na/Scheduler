package Scheduler.Service;

import Scheduler.Model.Scheduler;
import Scheduler.Repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class  SchedulerServiceImpl implements  SchedulerService{

    @Autowired
    private SchedulerRepository schedulerRepository;


    public SchedulerServiceImpl(SchedulerRepository schedulerRepository) {
        this.schedulerRepository = schedulerRepository;
    }

    public List<Scheduler> getAll(){
        return schedulerRepository.findAll();
    }
}
