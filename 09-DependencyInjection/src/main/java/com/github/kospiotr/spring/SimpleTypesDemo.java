package com.github.kospiotr.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Piotr
 */
public class SimpleTypesDemo {

    private String sampleString;
    private Integer sampleIntiger;
    private Double sampleDouble;
    private List<String> sampleList;
    private Set<String> sampleSet;
    private Map<String, String> sampleMap;

    public String getSampleString() {
        return sampleString;
    }

    public void setSampleString(String sampleString) {
        this.sampleString = sampleString;
    }

    public Integer getSampleIntiger() {
        return sampleIntiger;
    }

    public void setSampleIntiger(Integer sampleIntiger) {
        this.sampleIntiger = sampleIntiger;
    }

    public Double getSampleDouble() {
        return sampleDouble;
    }

    public void setSampleDouble(Double sampleDouble) {
        this.sampleDouble = sampleDouble;
    }

    public List<String> getSampleList() {
        return sampleList;
    }

    public void setSampleList(List<String> sampleList) {
        this.sampleList = sampleList;
    }

    public Set<String> getSampleSet() {
        return sampleSet;
    }

    public void setSampleSet(Set<String> sampleSet) {
        this.sampleSet = sampleSet;
    }

    public Map<String, String> getSampleMap() {
        return sampleMap;
    }

    public void setSampleMap(Map<String, String> sampleMap) {
        this.sampleMap = sampleMap;
    }

    @Override
    public String toString() {
        return "SimpleTypesDemo{" + "sampleString=" + sampleString + ", sampleIntiger=" + sampleIntiger + ", sampleDouble=" + sampleDouble + ", sampleList=" + sampleList + ", sampleSet=" + sampleSet + ", sampleMap=" + sampleMap + '}';
    }

}
