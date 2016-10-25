package resume;

/**
 * Created by O&J on 16.09.2016.
 */
public class Resume {

    private static int resumeCount = 0;
    // Unique identifier
    private String uuid;
    private String fio;
    private int age;
    private Boolean sex;

    public Resume(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    //    public static int getResumeCount() {
//        return resumeCount;
//    }
//
//
//    public Resume(){
//        resumeCount++;
//        this.uuid = resumeCount + "";
//    }
//
//    public static int getSize(){
//        return resumeCount;
//    }
//
//    public String getUuid() {
//        return uuid;
//    }

    // Alt + Insert


//    public Resume(String uuid, String name, String age, String sex) {
//        this.uuid = uuid;
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }

    @Override
    public String toString(){
        return uuid;
    }
}
