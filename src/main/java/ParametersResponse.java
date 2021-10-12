
public class ParametersResponse {
    private String payment_id;
    private String order_id;
    private String resp_code;
    private String message;

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setResp_code(String resp_code) {
        this.resp_code = resp_code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public String getResp_code() {
        return resp_code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ParametersResponse{" +
                "payment_id='" + payment_id + '\'' +
                ", order_id='" + order_id + '\'' +
                ", resp_code='" + resp_code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public ParametersResponse(String payment_id, String order_id, String resp_code, String message) {
        this.payment_id = payment_id;
        this.order_id = order_id;
        this.resp_code = resp_code;
        this.message = message;
    }

    public ParametersResponse(){

    }

}
