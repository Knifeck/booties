/**
 * Copyright (C) 2015 Zalando SE (http://tech.zalando.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.unknown.pkg.config;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.zalando.stups.spring.boot.actuator.ExtInfoEndpointConfiguration;

/**
 * 
 * @author jbellmann
 *
 */
@Configuration
public class CustomInfoEndpointConfiguration extends ExtInfoEndpointConfiguration {

	@Override
	protected List<String> getAllPropertiesFiles() {
		return newArrayList("git.properties", "artifact.properties");
	}
	
	

}
