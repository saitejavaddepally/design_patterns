package org.example.designPatterns.creational.prototype;

import java.util.List;

public class Statement implements Cloneable{

    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    @Override
    public Statement clone() {
        try {
            Statement clone = (Statement) super.clone();
            clone.setRecord(this.record.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "sql='" + sql + '\'' +
                ", parameters=" + parameters +
                ", record=" + record +
                '}';
    }
}
