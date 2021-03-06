/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ylzl.eden.spring.boot.integration.swagger2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.ylzl.eden.spring.boot.integration.core.IntegrationConstants;

/**
 * Swagger2 配置属性
 *
 * @author gyl
 * @since 1.0.0
 */
@Getter
@Setter
@ConfigurationProperties(prefix = IntegrationConstants.PROP_PREFIX + ".swagger2")
public class Swagger2Properties {

  private Boolean enabled = true;

  private String contactEmail = Swagger2Defaults.contactEmail;

  private String contactName = Swagger2Defaults.contactName;

  private String contactUrl = Swagger2Defaults.contactUrl;

  private String defaultIncludePattern = Swagger2Defaults.defaultIncludePattern;

  private String description = Swagger2Defaults.description;

  private String host = Swagger2Defaults.host;

  private String license = Swagger2Defaults.license;

  private String licenseUrl = Swagger2Defaults.licenseUrl;

  private String[] protocols = Swagger2Defaults.protocols;

  private String termsOfServiceUrl = Swagger2Defaults.termsOfServiceUrl;

  private String title = Swagger2Defaults.title;

  private Boolean useDefaultResponseMessages = Swagger2Defaults.useDefaultResponseMessages;

  private String version = Swagger2Defaults.version;
}
