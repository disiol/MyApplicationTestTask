package com.denisimusit.sample.denis.olenyk.modell;

public class MapModel {
    private String name;
    private String joinMapFiles;

    public MapModel(String name, String joinMapFiles) {
        this.name = name;
        this.joinMapFiles = joinMapFiles;
    }

    public MapModel(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getJoinMapFiles() {
        return joinMapFiles;
    }

    @Override
    public String toString() {
        return "MapModel{" +
                "name='" + name + '\'' +
                ", joinMapFiles='" + joinMapFiles + '\'' +
                '}';
    }
}
