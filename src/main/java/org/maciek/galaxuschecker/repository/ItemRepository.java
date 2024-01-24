package org.maciek.galaxuschecker.repository;

import org.maciek.galaxuschecker.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity, Integer> {

}