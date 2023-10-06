/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.auction.site;

/**
 *
 * @author AMAN KUMAR
 */
class Product_Bid {
    private String Category;
    private String ProductId;
    private String ProductName;
    private String Brand;
    private String ProductInfo;
    private String time_end;
    
    public Product_Bid(String Category,String ProductId,String ProductName,String Brand, String ProductInfo,String time_end)
    
    {
        this.Category=Category;
        this.ProductId=ProductId;
        this.ProductName=ProductName;
        this.Brand=Brand;
        this.ProductInfo=ProductInfo;
        this.time_end=time_end;
       
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
    public String getProductInfo()
    {
        return ProductInfo;
    }
    public String gettimeend()
    {
        return time_end;
    }
    
}
