package devices.configuration.configs;

import devices.configuration.remote.IntervalRules;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "features_configuration")
class FeaturesConfigurationEntity {
    @Id
    private String name;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private IntervalRules configuration;
}
