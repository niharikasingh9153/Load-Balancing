@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Map<String, Object> getOrderDetails(@PathVariable Long id) {
        String paymentServiceUrl = "http://payment-service/payments/" + id;
        Map paymentResponse = restTemplate.getForObject(paymentServiceUrl, Map.class);

        return Map.of(
                "orderId", id,
                "productName", "Laptop",
                "paymentStatus", paymentResponse.get("status"),
                "servedBy", paymentResponse.get("servedBy")
        );
    }
}
