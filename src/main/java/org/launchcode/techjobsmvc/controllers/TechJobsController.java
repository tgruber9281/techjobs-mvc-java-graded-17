package org.launchcode.techjobsmvc.controllers;

import org.launchcode.techjobsmvc.models.JobData;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Trevor Gruber
 */
public class TechJobsController {

/** fields */
    private static Map<String,String> actionChoices = new HashMap<>();
    private static Map<String, String> columnChoices = new HashMap<>();
    private static Map<String, Object> tableChoices = new HashMap<>();
    
/** Constructor(s) */
    public TechJobsController() {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
        
        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");
        
        /*
        * TODO This is a possible alternative for the ViewAll link?
        * tableChoices.put("all", JobData.findAll());
        */
        tableChoices.put("employer", JobData.getAllEmployers());
        tableChoices.put("location", JobData.getAllLocations());
        tableChoices.put("positionType", JobData.getAllPositionTypes());
        tableChoices.put("coreCompetency", JobData.getAllCoreCompetency());
        
    }
    
/** Getters and Setters */
    @ModelAttribute("actions")
    public Map<String,String> getActionChoices(){
        return actionChoices;
    }
    @ModelAttribute("columns")
    public Map<String,String> getColumnChoices(){
        return columnChoices;
    }
    @ModelAttribute("tableChoices")
    public Map<String,Object> getTableChoices(){
        return tableChoices;
    }
}
