package product;

import java.time.LocalDate;
import java.util.Random;

public class Product {
    private String productName;
    private int expDay;
    private boolean isFresh;
    private LocalDate producedOn;
    private String placeOFProduct;
    private static Random random= new Random();


    public void isFresh(){
        int ex=0;
        if (this.placeOFProduct.equals("Show-Case")){
            ex=this.expDay/2;
        }else {
            ex=this.expDay;
        }
        if (LocalDate.now().isAfter(this.producedOn.plusDays(ex))){
            this.isFresh = false;
        }else {
            this.isFresh = true;
        }
    }
    public  void generateDate(){
      random = new Random();
       this.producedOn= LocalDate.of(2023,
                random.nextInt(8)+1,
                random.nextInt(29)+1);

    }
    public void setPlace(){
        int randomNumber = random.nextInt(2);
        if(randomNumber ==1){
            this.placeOFProduct="Show-Case";
        }else {
            this.placeOFProduct="Ice-Box  ";
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String product) {
        this.productName = product;
    }

    public int getExpDay() {
        return expDay;
    }


    public boolean getIsFresh() {
        return this.isFresh;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }


    public void setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
    }

    public String getPlaceOFProduct() {
        return placeOFProduct;
    }

    public void setPlaceOFProduct(String placeOFProduct) {
        this.placeOFProduct = placeOFProduct;
    }

    public Product(String productName, int expDay) {
        this.productName = productName;
        this.expDay = expDay;
        generateDate();
        setPlace();
        isFresh();
    }
}
