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

package org.ylzl.eden.spring.boot.framework.web.rest.errors;

import org.springframework.http.HttpStatus;

/**
 * 错误凭证
 *
 * @author gyl
 * @since 1.0.0
 */
public class InvalidCredentialsException extends BadRequestAlertException {

  public InvalidCredentialsException() {
    super(ErrorEnum.INVALID_CREDENTIALS.getMessage());
  }

  public InvalidCredentialsException(String message) {
    super(message);
  }

  public InvalidCredentialsException(String message, String description) {
    super(message, description);
  }

  public int getStatusCode() {
    return HttpStatus.UNAUTHORIZED.value();
  }
}
