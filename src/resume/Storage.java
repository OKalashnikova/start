package resume;

/**
 * Created by O&J on 25.09.2016.
 */
public interface Storage {
    //CRUD
    //create
    void save(Resume uuid);

    void delete(String uuid);

    //read
    Resume get(String uuid);

    void update(Resume r);
}
