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

package org.ylzl.eden.spring.boot.data.core;

import lombok.experimental.UtilityClass;
import org.ylzl.eden.spring.boot.framework.core.FrameworkConstants;

/**
 * Spring Data 常量定义
 *
 * @author gyl
 * @since 1.0.0
 */
@UtilityClass
public final class DataConstants {

  /** 当前配置属性前缀 */
  public static final String PROP_PREFIX = FrameworkConstants.PROP_EDEN_PREFIX + ".data";

  /** Spring 数据源配置属性前缀 */
  public static final String PROP_DATASOURCE_PREFIX = "spring.datasource";
}
