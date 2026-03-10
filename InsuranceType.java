package org.example.javafxproject;

public class InsuranceType {
    private int id;
    private String typeName;

    public InsuranceType(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    @Override
    public String toString() { return typeName; } // [cite: 21]

    public int getId() { return id; }
    public String getTypeName() { return typeName; }
}
