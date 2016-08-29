import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PokemonTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /* Constructor no nickName test - nickName same as name if not specified **/
   @Test public void noNickNameTest(){
      Pokemon p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
      Assert.assertEquals("Name and nickName should be the same.", p.getName(), "Bulbasaur");
   
   }
   
   /*HP constructor test
   * Checks that HP in range   *
   */
   @Test public void hpRangeTest(){
      Pokemon p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
      int oldHP = p.getHP();
      int oldCP = p.getCP();
      p.powerUp();
      
      Assert.assertTrue("Powerup increases HP and CP",(oldHP < p.getHP() && oldCP <= p.getCP())); 
   }
   
   
   /* PowerUp test
   * Checks that HP always increases and CP never decreases
   *
   */
   @Test public void powerUpTest(){
      Pokemon p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
      int oldHP = p.getHP();
      int oldCP = p.getCP();
      p.powerUp();
      
      Assert.assertTrue("Powerup increases HP and CP",(oldHP < p.getHP() && oldCP <= p.getCP())); 
   }
   
   /* testing toString method
   * checks that toString is properly formatted.
   */
   @Test
   public void toStringTest1(){
      Pokemon p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
      int hP = p.getHP();
      int cP = p.getCP();
      Assert.assertEquals("To string correct format",  
         "Name: Bulbasaur\nNumber: 001\nType: Grass | Poison\nHP: "+hP+"\nCP: "+cP+"\n", p.toString());
   
   }
   
   /* testing toString method
   * checks that toString is properly formatted with nickName and empty type2.
   */
   @Test
   public void toStringTest2(){
      Pokemon p = new Pokemon("Charmander", "Lisa's Charmander", 4, "Fire", "");
      int hP = p.getHP();
      int cP = p.getCP();
      Assert.assertEquals("To string correct format",  
         "Name: Charmander\nNickname: Lisa's Charmander\nNumber: 004\nType: Fire\nHP: "+hP+"\nCP: "+cP+"\n", p.toString());
   
   }
   /* testing toString method
   * checks that toString is properly formatted with no nickName and empty type2.
   */
   @Test
   public void toStringTest3(){
      Pokemon p = new Pokemon("Caterpie", 10, "Bug", "");
      int hP = p.getHP();
      int cP = p.getCP();
      Assert.assertEquals("To string correct format",  
         "Name: Caterpie\nNumber: 010\nType: Bug\nHP: "+hP+"\nCP: "+cP+"\n", p.toString());
   
   }
   
//    /* should fail, no vertical bar if no type 2 */
//    @Test
//    public void toStringTest4(){
//       Pokemon p = new Pokemon("Caterpie", 10, "Bug", "");
//       int hP = p.getHP();
//       int cP = p.getCP();
//       Assert.assertEquals("To string incorrect format",  
//          "Name: Caterpie\nNumber: 010\nType: Bug | \nHP: "+hP+"\nCP: "+cP+"\n", p.toString());
//    
//    }
   
   /** Test get methods **/
   
   /*Test returning name */
   @Test
   public void getNameTest(){
      Pokemon p = new Pokemon("Caterpie", 10, "Bug", "");
      String actName = "Caterpie";
      
      Assert.assertEquals("getName returns Pokemon's name.",  
         actName, p.getName());
   
   }
   /* Test returning name as nickName when none specified */
   @Test
   public void getNickNameTest1(){
      Pokemon p = new Pokemon("Caterpie", 10, "Bug", "");
      String actNickName = "Caterpie";
      
      Assert.assertEquals("getNickName returns Pokemon's name if no nickName.",  
         actNickName, p.getNickName());
   
   }
   
   /* Test returning nickName when one is specified */
   @Test
   public void getNickNameTest2(){
      Pokemon p = new Pokemon("Squirtle", "My Squirtly", 7, "Water", "");
      String actNickName = "My Squirtly";
      
      Assert.assertEquals("getNickName returns Pokemon's nickName.",  
         actNickName, p.getNickName());
   
   }
  
   /* Test returning type1 */
   @Test
   public void getType1Test(){
      Pokemon p = new Pokemon("Squirtle", "My Squirtly", 7, "Water", "");
      String actType = "Water";
      
      Assert.assertEquals("getType1 returns Pokemon's type1.",  
         actType, p.getType1());
   
   }
   
   /* Test returning type2 */
   @Test
   public void getType2Test1(){
      Pokemon p = new Pokemon("Squirtle", "My Squirtly", 7, "Water", "");
      String actType = "";
      
      Assert.assertEquals("getType2 returns empty string when none.",  
         actType, p.getType2());
   
   }
   
   @Test
   public void getType2Test2(){
      Pokemon p = new Pokemon("Venusaur", "Lisa's Venusaur", 3, "Grass", "Poison");
      String actType = "Poison";
      
      Assert.assertEquals("getType2 returns Pokemon's type 2.",  
         actType, p.getType2());
   
   }
   
   @Test
   public void getNumberTest(){
      Pokemon p = new Pokemon("Venusaur", "Lisa's Venusaur", 3, "Grass", "Poison");
      int actNumber = 3;
      
      Assert.assertEquals("getNumber returns Pokemon number.",  
         actNumber, p.getNumber());
   
   }
   
   @Test
   public void setNickNameTest(){
       Pokemon p = new Pokemon("Venusaur", "Lisa's Venusaur", 3, "Grass", "Poison");
       p.setNickName("Venus");
       Assert.assertEquals("setNickName sets Pokemon's nickname to new value", "Venus", p.getNickName());
       
   }
   
   
}
