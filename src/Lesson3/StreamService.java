package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    /**
     *
     * @return
     */
    public List<StudentGroup> getSortedStream() {
        List<StudentGroup> groupList = new ArrayList<>(stream.getGroupList());
        StreamComparator comparator = new StreamComparator();
        Collections.sort(groupList, comparator);
        return groupList;
    }

    public List<StudentGroup> getSortedStreamBySize() {
        List<StudentGroup> studentGroups = new ArrayList<>(stream.getGroupList());
        studentGroups.sort(new StreamComparator());
        return studentGroups;
    }

    public Stream getStream() {
        return stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

}
