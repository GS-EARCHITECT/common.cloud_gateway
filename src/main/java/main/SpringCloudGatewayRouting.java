package main;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting {

    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
       return builder.routes()
      .route("spec1", r->r.path("/spec/**").uri("http://localhost:9913")) //static routing      
      .route("spec2", r->r.path("/spec2/**").uri("http://localhost:9913"))
      .route("course1", r->r.path("/courseManagement/**").uri("http://localhost:9954"))
      .route("org1", r->r.path("/batchManagement/**").uri("http://localhost:9922"))
      .route("org2", r->r.path("/sessionManagement/**").uri("http://localhost:9922"))
      .route("org3", r->r.path("/institutionManagement/**").uri("http://localhost:9922"))
      .route("servcs1", r->r.path("/serviceManagement/**").uri("http://localhost:9334"))
      .route("jobdetails1", r->r.path("/jobDetails/**").uri("http://localhost:9110"))
      .route("jobdetails2", r->r.path("/jobTypeTargetDetailsMgmt/**").uri("http://localhost:9110"))      
      .route("sched", r->r.path("/schedulerManagement/**").uri("http://localhost:9944")) //static routing
      .route("prodserv", r->r.path("/resourceCatalogManagement/**").uri("http://localhost:9978"))
      .build();
    }
}