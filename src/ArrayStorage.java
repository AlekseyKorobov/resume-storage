/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
  private  int countResume=0;


    void clear() {

    }

    void save(Resume r) {
        Integer intUuid = Integer.parseInt(r.uuid);
        storage[intUuid] = new Resume();
        storage[intUuid] = r;
        ++countResume;
    }

    Resume get(String uuid) {
        Integer intUuid = Integer.parseInt(uuid);
        return storage[intUuid];
    }

    void delete(String uuid) {
        Integer intUuid = Integer.parseInt(uuid);
        storage[intUuid] = null;
        --countResume;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

        return storage ;
                //new Resume[0];
    }

    int size() {
        return countResume;
    }
}
