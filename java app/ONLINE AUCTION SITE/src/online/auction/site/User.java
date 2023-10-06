/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.auction.site;

/**
 *
 * @author AMAN KUMAR
 */
class User {
    private String UserId;
    private String Name;
    public User(String UserId,String Name)
    {
        this.UserId=UserId;
        this.Name=Name;
    }
    
    public String getUserId()
    {
        return UserId;
    }
    public String getName()
    {
        return Name;
    }
}
