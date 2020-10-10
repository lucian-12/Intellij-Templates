#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class $NAME {

    @Id
    @GeneratedValue
    private java.lang.Long id;
    private java.lang.String name;

    public $NAME() {}

    public $NAME(String name) {
        this.name = name;
    }

    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "$NAME{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
