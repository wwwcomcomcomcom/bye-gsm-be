package wwwcomcom.byegsm.oneseo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wwwcomcom.byegsm.oneseo.repository.OneseoRepository;

@Service
@RequiredArgsConstructor
public class OneseoService {
    private final OneseoRepository oneseoRepository;
}
