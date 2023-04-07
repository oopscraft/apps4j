package org.oopscraft.arch4j.core.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthoritySearch {

    private String id;

    private String name;

}