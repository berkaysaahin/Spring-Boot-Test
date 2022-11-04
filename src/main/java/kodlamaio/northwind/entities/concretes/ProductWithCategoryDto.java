package kodlamaio.northwind.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductWithCategoryDto {
    private int id;
    private String productName;
    private String categoryName;

}
