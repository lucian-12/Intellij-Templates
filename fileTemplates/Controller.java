#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class $NAME {

    @GetMapping(value = "",
            produces = MediaType.APPLICATION_JSON_VALUE)
    $DomainClass get$DomainClass() {
        return null;
    }

    @PostMapping(value = "",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    void post$DomainClass(@RequestBody $DomainClass new$DomainClass) {
        return;
    }
}
