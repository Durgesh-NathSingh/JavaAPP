/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.auction.site;

/**
 *
 * @author AMAN KUMAR
 */
public class Winners {
    private String ProductId;
    private String BidderId;
    private String SellerId;
    private String Amount;
    
    
    public Winners(String ProductId,String BidderId,String SellerId,String Amount)
    
    {
        this.ProductId=ProductId;
        this.BidderId=BidderId;
        this.SellerId=SellerId;
        this.Amount=Amount;
    }
    
    public String getProductId()
    {
        return ProductId;
    }
    public String getBidderId()
    {
        return BidderId;
    }
    public String getSellerId()
    {
        return SellerId;
    }
    public String getAmount()
    {
        return Amount;
    }
}
