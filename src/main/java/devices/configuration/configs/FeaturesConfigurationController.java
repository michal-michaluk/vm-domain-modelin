package devices.configuration.configs;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class FeaturesConfigurationController {

    private final FeaturesConfigurationRepository repository;

    //@GetMapping(path = "???")
    //public String get(@PathVariable String configName) {

    //@PutMapping(path = "???")
    //public String put(@PathVariable String configName, @Body String configuration) {

}
