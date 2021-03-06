package ir.maktab.homeworks.hw15.arf.repositories;

import ir.maktab.homeworks.hw15.arf.entities.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

    @Transactional
    @Modifying
    @Query("update Medicine m set m.title = ?1, m.code = ?2, m.price = ?3, m.description = ?4 where m.id = ?5")
    void updateById(String title, Integer code, Integer price, String description, Long id);
}
