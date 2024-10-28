package wwwcomcom.byegsm.oneseo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import wwwcomcom.byegsm.oneseo.service.OneseoService;

@RestController("/oneseo")
@RequiredArgsConstructor
public class OneseoController {
    private final OneseoService oneseoService;
}
