Q3. Create schema in any Database script or any ORM (Object Relational Mapping).

  import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product_category")
class ProductCategory {
    @Id
    private int id;

    private String name;
    private String desc;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modified_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted_at;
}

@Entity
@Table(name = "discount")
class Discount {
    @Id
    private int discount_id;

    private String name;
    private String desc;
    private double discount_percent;
    private boolean active;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modified_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted_at;
}

@Entity
@Table(name = "product_inventory")
class ProductInventory {
    @Id
    private int category_id;

    private int quantity;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modified_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted_at;
}

@Entity
@Table(name = "product")
class Product {
    @Id
    private int id;

    private String name;
    private String desc;
    private String SKU;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory category;

    @OneToOne
    @JoinColumn(name = "inventory_id")
    private ProductInventory inventory;

    private double price;

    @ManyToOne
    @JoinColumn(name = "discout_at")
    private Discount discount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modified_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted_at;
}

