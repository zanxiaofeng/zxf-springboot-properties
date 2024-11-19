# Key Classes
- com.ulisesbocchio.jasyptspringboot.resolver.DefaultPropertyResolver
- com.ulisesbocchio.jasyptspringboot.detector.DefaultPropertyDetector
- com.ulisesbocchio.jasyptspringboot.detector.DefaultLazyPropertyDetector

# FeatureToggle Design Pattern
- Feature Toggle
- User Level Feature Toggle
- Case Level Feature Toggle

# Test
- curl "http://localhost:8080/feature/toggle?feature=FeatureA&type=User&target=UserA"
- curl "http://localhost:8080/feature/toggle?feature=FeatureA&type=User&target=UserB"
- curl "http://localhost:8080/feature/toggle?feature=FeatureB&type=Case&target=CaseA"
- curl "http://localhost:8080/feature/toggle?feature=FeatureB&type=Case&target=CaseB"
- curl "http://localhost:8080/spring/env?property=jasypt.encryptor.algorithm"
- curl "http://localhost:8080/spring/env?property=yaml.a.b.c"
- curl "http://localhost:8080/spring/env?property=property.a.b.c"
- curl "http://localhost:8080/spring/env?property=yaml.a.d.d"
- curl "http://localhost:8080/spring/env?property=property_a_d_d"
- curl "http://localhost:8080/spring/env?property=yaml.a.d.e"
- curl "http://localhost:8080/spring/env?property=property-a-d-e"