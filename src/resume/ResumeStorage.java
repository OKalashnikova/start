package resume;

/**
 * Created by O&J on 25.09.2016.
 */
public class ResumeStorage implements Storage {
    final int storageMaxLength = 10000;
    Resume[] storage = new Resume[storageMaxLength];
    private int size = 0;


    @Override
    public void save(Resume r) {
        if (size == storageMaxLength) {
            System.out.println("Storage is FULL");
            return;
        }
            for (int i = 0; i < size; i++) {
                if (storage[i].getUuid().equals(r.getUuid())) {
                    System.out.println("Sorry, this resume " + r.getUuid() + " exist");
                    return;
                }
            }
            storage[size] = r;
            size++;
        }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Resume get(String uuid) {
        for (int i = 0; i < size; i++){
            if (storage[i].getUuid().equals(uuid)){
                return storage[i];
            }
        }
        System.out.println("Извините, такого резюме " + uuid + " не существует");
        return null;
    }

    @Override
    public void update(Resume r) {

    }

    public int size() {
        return size;
    }

    public Resume[] getAll(){
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size =0;
    }
}
