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