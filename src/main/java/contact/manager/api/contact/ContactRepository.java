package contact.manager.api.contact;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ContactRepository extends org.springframework.data.repository.Repository<Contact, UUID>, ExtendedContactRepository {

    @Query(
        "select c from Contact c left join fetch c.phoneNumberMap p left join fetch " +
        "c.emailMap e left join fetch addressMap a left join fetch c.user u where c.id = :id"
    )
    Optional<Contact> findById(@Param("id") UUID id);

    void deleteById(UUID uuid);
}