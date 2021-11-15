package dev.andreashacker.talents;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "talents")
public interface TalentDataRestRepository extends PagingAndSortingRepository<Talent, UUID> {
}
