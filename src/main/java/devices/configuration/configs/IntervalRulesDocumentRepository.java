package devices.configuration.configs;

import devices.configuration.remote.IntervalRules;
import devices.configuration.remote.IntervalRulesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IntervalRulesDocumentRepository implements IntervalRulesRepository {

    private final FeaturesConfigurationRepository repository;

    @Override
    public IntervalRules get() {
        return repository.findByName("IntervalRules")
                .map(FeaturesConfigurationEntity::getConfiguration)
                .orElse(IntervalRules.defaultRules());
    }
}
