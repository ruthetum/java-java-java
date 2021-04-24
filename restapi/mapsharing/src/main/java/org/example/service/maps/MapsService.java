package org.example.service.maps;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.MapsResponseDto;
import org.example.domain.maps.Maps;
import org.example.domain.maps.MapsRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MapsService {
    private final MapsRepository mapsRepository;

    public MapsResponseDto findById(Long mapIdx) {
        Maps entity = mapsRepository.findById(mapIdx)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id : " + mapIdx));
        return new MapsResponseDto(entity);
    }
}
