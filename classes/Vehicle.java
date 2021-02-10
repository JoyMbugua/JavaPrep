class Vehicle{
    public int mYear;
    public String mBrand;
    public String mModel;
    public int mMiles;
    public int mPrice;
    public Vehicle(int year, String brand, String model, int miles, int price){
        mYear = year;
        mBrand = brand;
        mModel = model;
        mMiles = miles;
        mPrice = price;
    }
    public boolean worthBuying(int maxPrice){
        return mPrice < maxPrice;
    }
}