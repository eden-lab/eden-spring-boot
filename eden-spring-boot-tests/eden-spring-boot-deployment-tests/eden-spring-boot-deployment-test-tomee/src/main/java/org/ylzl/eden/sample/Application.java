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

package org.ylzl.eden.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ylzl.eden.spring.boot.support.SpringBootApplicationAdapter;

/**
 * Spring Boot 引导类
 *
 * @author gyl
 * @since 1.0.0
 */
@RestController
@Slf4j
@SpringBootApplication
public class Application extends SpringBootApplicationAdapter {

  public Application(Environment env) {
    super(env);
  }

  /**
   * 启动入口
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Application.class);
    Environment env = run(app, args);
    logApplicationServerAfterRunning(env);
  }

  /**
   * 测试入口
   *
   * @return 测试信息
   */
  @GetMapping("/")
  public String hello() {
    return "Hello World";
  }
}
