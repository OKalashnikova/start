package resume;

/**
 * Created by O&J on 16.09.2016.
 */
public class Main {

    public static void main(String[] args) {


        ResumeStorage resumeStorage = new ResumeStorage();
        Resume resum = new Resume("1");
        resumeStorage.save(resum);
        Resume resum2 = new Resume("2");
        resumeStorage.save(resum2);
        Resume resum3 = new Resume("3");
        resumeStorage.save(resum3);

        Resume[] resumes = resumeStorage.getAll();
        for(Resume r: resumes){
            System.out.println(r);
        }


    }
}
