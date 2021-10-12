
import java.time.Instant;

public class ParametersRequest {
    private String amount;
    private String currtncy;
    private String order_id;
    private String phone;
    private String description;

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCurrtncy(String currtncy) {
        this.currtncy = currtncy;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrtncy(String rub) {
        return currtncy;
    }

    public String getOrder_id(String testorder222) {
        return order_id;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ParametersRequest{" +
                "amount=" + amount +
                ", currtncy=" + currtncy +
                ", order_id='" + order_id + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
