package com.demo.ccc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollection {
    // 数组类型
    private String[] courses;
    // list 集合类型
    private List<String> list;
    // map 集合类型
    private Map<String, String> maps;
    // set 集合类型
    private Set<String> sets;
    // 对象数组类型
    private CollectionObject[] cos;

    public void setCos(CollectionObject[] cos) {
        this.cos = cos;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "【JavaCollection】{" +
                "coursesArr=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", collectionObjectArr=" + Arrays.toString(cos) +
                '}';
    }
}
