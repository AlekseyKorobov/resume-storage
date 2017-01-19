/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {

    }

    void save(Resume r) {
        Integer intUuid = Integer.parseInt(r.uuid);
        storage [intUuid] = r ;
    }

    Resume get(String uuid) {
        return null;
    }

    void delete(String uuid) {
        Integer intUuid = Integer.parseInt(uuid);
        storage [intUuid] = null ;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return new Resume[0];
    }

    int size() {
        return 0;
    }
}
