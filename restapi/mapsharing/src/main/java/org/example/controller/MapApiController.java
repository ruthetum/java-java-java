package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.MapsResponseDto;
import org.example.service.maps.MapsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MapApiController {

    private final MapsService mapsService;

    @GetMapping("/api/v1/maps/{userIdx}")
    @ResponseStatus(value = HttpStatus.OK)
    public MapsResponseDto findById(@PathVariable Long userIdx) {
        return mapsService.findById(userIdx);
    }
}
