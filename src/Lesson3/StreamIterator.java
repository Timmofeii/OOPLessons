package Lesson3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> groupList;
    private int counter;

    public StreamIterator(Stream stream) {
        this.groupList = stream.getGroupList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groupList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return groupList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
       if(hasNext()){
           groupList.remove(--counter);
       }
    }

}
