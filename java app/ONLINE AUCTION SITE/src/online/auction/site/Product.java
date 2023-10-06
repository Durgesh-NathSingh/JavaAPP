/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.auction.site;

/**
 *
 * @author AMAN KUMAR
 */
class Product {
    private String Category;
    private String ProductId;
    private String ProductName;
    
    public Product(String Category,String ProductId,String ProductName)
    {
        this.Category=Category;
        this.ProductId=ProductId;
        this.ProductName=ProductName;
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
    
}
