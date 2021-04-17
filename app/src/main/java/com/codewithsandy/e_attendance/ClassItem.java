package com.codewithsandy.e_attendance;

public class


ClassItem {
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ClassItem(String className, long cid, String subjectName) {
        this.className = className;
        this.cid = cid;
        this.subjectName = subjectName;
    }

    private  String className;

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    private long cid;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private  String subjectName;

    public ClassItem(String className,String subjectName)
    {
        this.className=className;
        this.subjectName=subjectName;
    }
}
