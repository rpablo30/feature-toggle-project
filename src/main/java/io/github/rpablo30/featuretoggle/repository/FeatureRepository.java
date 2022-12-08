package io.github.rpablo30.featuretoggle.repository;

import io.github.rpablo30.featuretoggle.entity.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {






}
