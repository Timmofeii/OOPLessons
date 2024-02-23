package Lesson3;

import java.util.Iterator;
import java.util.List;


public class Stream implements Iterable<StudentGroup> {

    private List<StudentGroup> groupList;


    public Stream(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return groupList.toString();
    }
}
