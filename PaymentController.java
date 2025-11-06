@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/{id}")
    public Map<String, Object> getPaymentStatus(@PathVariable Long id) {
        return Map.of(
                "paymentId", id,
                "status", "SUCCESS",
                "servedBy", "Instance running on port 8082"
        );
    }
}
