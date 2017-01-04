/*
 * Copyright 2014-2016 the original author or authors.
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
package org.liquigraph.examples.dagger2.di.component;

import dagger.Component;
import org.liquigraph.examples.dagger2.di.module.EmbeddedDAOModule;
import org.liquigraph.examples.dagger2.di.module.EmbeddedLiquigraphModule;

import javax.inject.Singleton;

/**
 * Liquigraph and DAO using an embedded neo4j database
 */
@Singleton
@Component(modules = {EmbeddedDAOModule.class, EmbeddedLiquigraphModule.class})
public interface MigrationTestComponent extends MigrationComponent {


}
