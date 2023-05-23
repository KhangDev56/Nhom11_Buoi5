package fit.hutech.vuminhkhang.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class Product
{
    private int id;
    @NotBlank(message = "Ten san pham khong duoc de trong")
    private String name;
    @Length(min = 0, max = 50, message = "Ten hinh anh khong qua 50 ky tu")
    private String image;
    @NotNull(message = "Gia san pham khong duoc de trong")
    @Min(value = 1, message = "Gia san pham khong duoc nho hon 1")
    @Max(value = 999999999, message = "Gia san pham khong qua 999999999")
    private long price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
