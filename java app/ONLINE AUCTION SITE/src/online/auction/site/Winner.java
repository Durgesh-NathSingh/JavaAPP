/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.auction.site;

/**
 *
 * @author AMAN KUMAR
 */
public class Winner {
    private String ProductId;
    private String ProductName;
    private String Bidder_Id;
    private String Seller_Id;
    private String Amount;
    
    public Winner(String ProductId,String ProductName,String Bidder_Id, String Seller_Id,String Amount)
    
    {
        this.ProductId=ProductId;
        this.ProductName=ProductName;
        this.Bidder_Id=Bidder_Id;
        this.Seller_Id=Seller_Id;
        this.Amount=Amount;
       
    }
    
   
    public String getProductId()
    {
        return ProductId;
    }
    public String getProductName()
    {
        return ProductName;
    }
    public String getBidder_Id()
    {
        return Bidder_Id;
    }
    public String getSeller_Id()
    {
        return Seller_Id;
    }
    public String getAmount()
    {
        return Amount;
    }
}
