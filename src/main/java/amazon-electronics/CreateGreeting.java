/*
 * Copyright 2016-2017 Testify Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package amazon-electronics;

import java.util.Map;
import java.util.UUID;

import amazon-electronics.common.RandomUuidSupplier;
import amazon-electronics.model.GreetingModel;

/**
 * A service that creates a new greeting.
 *
 * @author saden
 */
public class CreateGreeting {

    private final Map<UUID, GreetingModel> store;
    private final RandomUuidSupplier randomUuidSupplier;

    CreateGreeting(Map<UUID, GreetingModel> store, RandomUuidSupplier randomUuidSupplier) {
        this.store = store;
        this.randomUuidSupplier = randomUuidSupplier;
    }

    /**
     * Create the given greeting.
     *
     * @param model the greeting model
     */
    public void createGreeting(GreetingModel model) {
        UUID id = randomUuidSupplier.get();
        store.put(id, model);
    }
}
