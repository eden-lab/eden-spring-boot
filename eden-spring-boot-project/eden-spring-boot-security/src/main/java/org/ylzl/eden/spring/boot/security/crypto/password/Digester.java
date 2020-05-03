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

package org.ylzl.eden.spring.boot.security.crypto.password;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 摘要器
 *
 * @author gyl
 * @since 0.0.1
 */
public final class Digester {

  private final String algorithm;

  private int iterations;

  public Digester(String algorithm, int iterations) {
    createDigest(algorithm);
    this.algorithm = algorithm;
    setIterations(iterations);
  }

  public byte[] digest(byte[] value) {
    MessageDigest messageDigest = createDigest(algorithm);
    for (int i = 0; i < iterations; i++) {
      value = messageDigest.digest(value);
    }
    return value;
  }

  final void setIterations(int iterations) {
    if (iterations <= 0) {
      throw new IllegalArgumentException("Iterations value must be greater than zero");
    }
    this.iterations = iterations;
  }

  private static MessageDigest createDigest(String algorithm) {
    try {
      return MessageDigest.getInstance(algorithm);
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException("No such hashing algorithm", e);
    }
  }
}
