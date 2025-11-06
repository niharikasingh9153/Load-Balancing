@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced  // Enables service-name-based load balancing
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
