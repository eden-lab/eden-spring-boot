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

package org.ylzl.eden.spring.boot.framework.scheduling;

import lombok.experimental.UtilityClass;

/**
 * Scheduling 配置属性默认值
 *
 * @author gyl
 * @since 0.0.1
 */
@UtilityClass
public final class SchedulingDefaults {

  public static class TaskExecutor {

    public static final int corePoolSize = 2;

    public static final int maxPoolSize = 50;

    public static final int queueCapacity = 10000;
  }
}
