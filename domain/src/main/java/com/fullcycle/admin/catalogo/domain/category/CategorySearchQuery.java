package com.fullcycle.admin.catalogo.domain.category;

import java.util.List;

public record CategorySearchQuery(
        int page,
        int perPage,
        String terms,
        String sort,
        String direction

) {
}
