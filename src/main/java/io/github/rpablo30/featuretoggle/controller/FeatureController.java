package io.github.rpablo30.featuretoggle.controller;

import io.github.rpablo30.featuretoggle.dto.FeatureDto;
import io.github.rpablo30.featuretoggle.dto.UserDto;
import io.github.rpablo30.featuretoggle.service.FeatureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/feature")
public class FeatureController {


    @Autowired
    private FeatureServiceImpl service;

    @PostMapping
    public ResponseEntity<FeatureDto> save(@RequestBody FeatureDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<FeatureDto>> findById(@PathVariable Long id) {
        Optional<FeatureDto> dto = service.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
    @GetMapping
    public ResponseEntity<Page<FeatureDto>> ListAll(@PageableDefault(page = 0,
            size = 8,
            sort = "id") Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll(pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FeatureDto> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<FeatureDto> update(@PathVariable Long id, @RequestBody FeatureDto dto) {
        dto = service.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }




}
