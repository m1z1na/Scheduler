package Scheduler.Controller;

import Scheduler.Model.Scheduler;
import Scheduler.Service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MainController {

    @Autowired
    private final SchedulerService schedulerService;

    public MainController(SchedulerService schedulerService) {
        this.schedulerService = schedulerService;
    }

    @GetMapping(value = "/")
    public String index(Model model) {
        return "calendar";
    }

    @ResponseBody
    @GetMapping(value = "/test")
    public List<Scheduler> test(Model model) {
        return schedulerService.getAll();
    }

}
