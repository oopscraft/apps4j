package org.oopscraft.arch4j.core.common.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Properties;

@ConfigurationProperties(prefix="core.storage.storage-client")
@ConstructorBinding
@AllArgsConstructor
@Getter
@Validated
public class StorageClientProperties {

    @NotNull
    private final String bean;

    @NotNull
    private final Properties properties;

}
