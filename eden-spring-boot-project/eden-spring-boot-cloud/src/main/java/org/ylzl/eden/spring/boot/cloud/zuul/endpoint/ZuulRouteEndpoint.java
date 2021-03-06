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
package org.ylzl.eden.spring.boot.cloud.zuul.endpoint;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;

import java.util.ArrayList;
import java.util.List;

/**
 * 网关端点
 *
 * <p>从 Spring Boot 1.X 升级到 2.X
 *
 * <ul>
 *   <li>org.springframework.boot.actuate.endpoint.AbstractEndpoint 变更为 {@link Endpoint}
 * </ul>
 *
 * @author gyl
 * @since 2.0.0
 */
@Builder
@Slf4j
@Endpoint(id = ZuulRouteEndpoint.ENDPOINT_ID)
public class ZuulRouteEndpoint {

  public static final String ENDPOINT_ID = "zuul-routes";

  private final RouteLocator routeLocator;

  private final DiscoveryClient discoveryClient;

  public ZuulRouteEndpoint(RouteLocator routeLocator, DiscoveryClient discoveryClient) {
    this.routeLocator = routeLocator;
    this.discoveryClient = discoveryClient;
  }

  @ReadOperation
  public List<ZuulRoute> zuulRoutes() {
    List<Route> routes = routeLocator.getRoutes();
    List<ZuulRoute> zuulRoutes = new ArrayList<>();
    for (Route route : routes) {
      ZuulRoute zuulRoute = new ZuulRoute();
      zuulRoute.setPath(route.getFullPath());
      zuulRoute.setServiceId(route.getId());
      zuulRoute.setServiceInstances(discoveryClient.getInstances(route.getLocation()));
      zuulRoutes.add(zuulRoute);
    }
    return zuulRoutes;
  }
}
