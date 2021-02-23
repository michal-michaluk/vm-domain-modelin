package devices.configuration.configs;

import devices.configuration.IntegrationTest;
import devices.configuration.JsonAssert;
import devices.configuration.remote.IntervalRules;
import devices.configuration.remote.IntervalRulesFixture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static devices.configuration.TestTransaction.transactional;

@IntegrationTest
@Transactional
class IntervalRulesRepositoryTest {

    //@Autowired
    //private FeaturesConfigurationRepository configs;

    @Autowired
    private IntervalRulesRepository repository;

    @Test
    public void shouldLoadIntervalRules() {
        //given
        String name = "IntervalRules";
        var entity = entity(name, IntervalRulesFixture.currentRules());

        // when
        //transactional(() -> configs.save(entity));
        var result = transactional(() -> repository.get());

        // then
        JsonAssert.assertThat(result).isExactlyLike(IntervalRulesFixture.currentRules());
    }

    private Object entity(String name, IntervalRules value) {
        //FeaturesConfigurationEntity entity = new FeaturesConfigurationEntity();
        //entity.setConfiguration(value);
        //entity.setName(name);
        //return entity;
        return null;
    }
}
