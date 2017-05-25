package org.apache.griffin.core.measure;


import org.apache.griffin.core.util.GriffinOperationMessage;
import org.springframework.web.bind.annotation.PathVariable;

public interface MeasureService {

    public Iterable<Measure> getAllMeasures();

    public Measure getMeasuresById(long id);

    public Measure getMeasuresByName(String measureName);


    public void deleteMeasuresById(@PathVariable("MeasureId") Long MeasureId);


    public GriffinOperationMessage deleteMeasuresByName(String measureName) ;

    public GriffinOperationMessage updateMeasure(Measure measure);


    public GriffinOperationMessage createNewMeasure(Measure measure);
}