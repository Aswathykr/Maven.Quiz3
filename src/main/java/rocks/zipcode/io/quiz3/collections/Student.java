package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    Map<Lab, LabStatus> labStatusMap = new HashMap<>();
    Map<String, Lab> labMap = new HashMap<>();

    @Override
    public String toString() {
        String result = "";
        Lab[] labArray = labStatusMap.keySet().toArray(new Lab[labStatusMap.keySet().size()]);

        Arrays.sort(labArray);
        for(Lab lab : labArray){
            result = result + lab.getName() + " > " + labStatusMap.get(lab)+ "\n";
        }
        return result.substring(0, result.length()-1);
    }

    public Student() {
        this(null);
    }

    public Student(Map<Lab, LabStatus> map) {
        if(map != null)
           this.labStatusMap = map;
    }

    public Lab getLab(String labName) {

        return labMap.get(labName);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = labMap.getOrDefault(labName, null);
        if(lab == null){
            throw new UnsupportedOperationException();
        }
        labStatusMap.put(lab, labStatus);
    }



    public void forkLab(Lab lab) {

        labMap.put(lab.getName(), lab);
        labStatusMap.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        Lab lab = labMap.getOrDefault(labName, new Lab(labName));

        return labStatusMap.get(lab);
    }
}
