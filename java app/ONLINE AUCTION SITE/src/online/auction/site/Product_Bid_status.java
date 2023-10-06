/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.auction.site;

/**
 *
 * @author AMAN KUMAR
 */
public class Product_Bid_status {
    private String Category;
    private String ProductId;
    private String ProductName;
    private String Brand;
    private String BidderId;
    private String Amount;
    
    public Product_Bid_status(String Category,String ProductId,String ProductName,String Brand, String BidderId,String Amount)
    
    {
        this.Category=Category;
        this.ProductId=ProductId;
        this.ProductName=ProductName;
        this.Brand=Brand;
        this.BidderId=BidderId;
        this.Amount=Amount;
       
    }
    
    public String getCategory()
    {
        return Category;
    }
    public String getProductId()
    {
        return ProductId;
    }
    public String getProductName()
    {
        return ProductName;
    }
    public String getBrand()
    {
        return Brand;
    }
    public String getBidderId()
    {
        return BidderId;
    }
    public String getAmount()
    {
        return Amount;
    }
}
