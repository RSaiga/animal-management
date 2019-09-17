package com.lib.training.domain.type;

import java.util.UUID;

public interface IdGenerator {
    default String generate() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
