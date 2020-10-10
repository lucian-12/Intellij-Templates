#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class $NAME {

    public $NAME(java.lang.String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private java.lang.Long id;

    private java.lang.String name;
}
