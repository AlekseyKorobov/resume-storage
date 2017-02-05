/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
  private  int countResume=0;


    void clear() {

    }

    void save(Resume r) {

        boolean notFindEquil = true ;
        if (countResume=storage.length){//проверка на переполнение
            System.out.println("Нет места.необходимо удалить минимум одно резюме");
            return;
        }
        for (int i = 0; i <storage.length-1 ; i++) {
            if (storage[i].uuid==r.uuid){ //проверка на уникальность
                notFindEquil = false ;
                System.out.println("Резюме с данным номером уже сущ.Перезаписать? Yes/No");
                //здесь будет блок Input с консоли с последующей проверкой
                if (yes){storage[i]=r;}
                else { break;}
            }

        }
        // запись резюме в пустой элент массива если оно новое
        if (notFindEquil) {
            for (int j = 0; j < storage.length - 1; j++) {
                if (storage[j] == null) {
                    storage[j] = new Resume();
                    storage[j] = r;
                    ++countResume;// счетчик резюме
                    break;
                }
            }
        }
    }

    String get(String uuid) {
        boolean notFindEquil = true ;
        for (int i = 0; i < storage.length - 1; i++) {
            if (storage[i].uuid = uuid) {
                return storage[i];
                notFindEquil = false;
                break;
            }
        }
       if(notFindEquil) return "резюме под данным номером отсутствует";
    }

    void delete(String uuid) {

        for (int i = 0; i < countResume; i++)
            if (storage[i].uuid = uuid) {
                for (int j = i; j <= countResume - 1; j++) { //сдвигаем все резюме справо налево для отсутсвия null в середине
                    storage[j] = storage[j + 1];
                }
                storage[countResume] = null;
                --countResume;
                break;
            } else {
                System.out.println("резюме под данным номером отсутствует");
            }
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
