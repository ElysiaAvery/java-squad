import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class HeroTest {

  @After
  public void tearDown() {
    Hero.clear();
  }

  @Test
  public void hero_instantiatesCorrectly_true() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    assertTrue(testHero instanceof Hero);
  }

  @Test
  public void getName_heroIntantiatesWithName_SilverSurfer() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    assertEquals("Silver Surfer", testHero.getName());
  }

  @Test
  public void getAge_heroIntantiatesWithAge_30() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    assertEquals(30, testHero.getAge());
  }

  @Test
  public void getPower_heroIntantiatesWithPower_SurfingSpace() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    assertEquals("surfing space, private council with galactus", testHero.getPower());
  }

  @Test
  public void getWeakness_heroIntantiatesWithWeakness_Sad() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    assertEquals("sad", testHero.getWeakness());
  }

  @Test
  public void getImg_heroIntantiatesWithImg_url() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    assertEquals("http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg", testHero.getImg());
  }

  @Test
  public void all_returnsAllInstancesOfHero_true(){
    Hero hero1 = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    Hero hero2 = new Hero("Galactus", 100, "almightiness", "energy loss", "http://i.imgur.com/8n438.jpg");
    assertTrue(Hero.all().contains(hero1));
    assertTrue(Hero.all().contains(hero2));
  }

  @Test
  public void clear_emptiesAllHeroesFromArrayList_0() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    Hero.clear();
    assertEquals(Hero.all().size(), 0);
  }

  @Test
  public void getId_categoriesInstantiateWithAnId_1() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    assertEquals(1, testHero.getId());
  }

  @Test
  public void find_returnsHeroWithSameId_hero2() {
    Hero hero1 = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    Hero hero2 = new Hero("Galactus", 100, "almightiness", "energy loss", "http://i.imgur.com/8n438.jpg");
    assertEquals(Hero.find(hero2.getId()), hero2);
  }

  @Test
  public void getSquads_initiallyReturnsEmptyList_ArrayList() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    assertEquals(0, testHero.getSquads().size());
  }

  @Test
  public void addSquad_addsSquadToList_true() {
    Hero testHero = new Hero("Silver Surfer", 30, "surfing space, private council with galactus", "sad", "http://67.media.tumblr.com/d68751b1e66ce0d39ae91e967064213d/tumblr_n1kr8aDlVu1sqf5tdo1_1280.jpg");
    Squad testSquad = new Squad("Power Rangers", 10, "Fighting Kaiju");
    testHero.addSquad(testSquad);
    assertTrue(testHero.getSquads().contains(testSquad));
  }
}
