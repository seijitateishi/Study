package SeijiFood.Payment.controller;

import SeijiFood.Payment.dto.PaymentDto;
import SeijiFood.Payment.model.Payment;
import SeijiFood.Payment.service.PaymentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.awt.print.Pageable;
import java.net.URI;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @GetMapping
    public Page<PaymentDto> list(@PageableDefault(size = 10) Pageable pagination){
        return service.getAll(pagination);
    }

    @GetMapping("/{id}") public ResponseEntity<PaymentDto> detail(@PathVariable @NotNull Long id){
        PaymentDto dto = service.getbyId(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<PaymentDto> register(@RequestBody @Valid PaymentDto dto, UriComponentsBuilder uriBuilder){
        PaymentDto payment = service.createPayment(dto);
        URI adress = uriBuilder.path("/payments/{id}").buildAndExpand(payment.getId()).toUri();

        return ResponseEntity.created(adress).body(payment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentDto> refresh(@PathVariable @NotNull Long id, @RequestBody @Valid PaymentDto dto) {
        PaymentDto updated = service.refreshPayment(id, dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PaymentDto> remover(@PathVariable @NotNull Long id) {
        service.deletePayment(id);
        return ResponseEntity.noContent().build();
    }

}
