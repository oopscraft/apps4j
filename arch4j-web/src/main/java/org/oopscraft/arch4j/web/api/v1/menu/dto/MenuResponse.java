package org.oopscraft.arch4j.web.api.v1.menu.dto;

import lombok.*;
import org.oopscraft.arch4j.core.menu.Menu;
import org.oopscraft.arch4j.core.menu.MenuTarget;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MenuResponse {

    private String menuId;

    private String parentMenuId;

    private String name;

    private String link;

    private MenuTarget target;

    private String icon;

    private Integer sort;

    /**
     * factory method
     * @param menu menu
     * @return menu response
     */
    public static MenuResponse from(Menu menu) {
        return MenuResponse.builder()
                .menuId(menu.getMenuId())
                .parentMenuId(menu.getParentMenuId())
                .name(menu.getName())
                .link(menu.getLink())
                .target(menu.getTarget())
                .icon(menu.getIcon())
                .sort(menu.getSort())
                .build();

    }

}