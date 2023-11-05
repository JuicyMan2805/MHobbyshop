package Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Product")
public class ProductEntity extends SuperEntity{
    @Column(name = "name")
    private String name;

    @Column(name = "Product_Comment")
    private String productReview;

//    lấy dữ liệu từ người bán hàng
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private AuthEntity author;

//    lấy dữ liệu qua id trung gian
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

}
