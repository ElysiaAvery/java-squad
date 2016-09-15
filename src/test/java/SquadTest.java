import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SquadTest {

  @After
  public void tearDown() {
    Squad.clear();
  }

  @Test
  public void squad_instantiatesCorrectly_true() {
    Squad testSquad = new Squad("Power Rangers", 10, "Fighting Kaiju");
    assertTrue(testSquad instanceof Squad);
  }

  @Test
  public void getName_squadInstantiatesWithName_PowerRangers() {
    Squad testSquad = new Squad("Power Rangers", 10, "Fighting Kaiju");
    assertEquals("Power Rangers", testSquad.getName());
  }

  @Test
  public void getSize_squadInstantiatesWithSize_10() {
    Squad testSquad = new Squad("Power Rangers", 10, "Fighting Kaiju");
    assertEquals(10, testSquad.getSize());
  }

  @Test
  public void getCause_squadInstantiatesWithCause_FightingKaiju() {
    Squad testSquad = new Squad("Power Rangers", 10, "Fighting Kaiju");
    assertEquals("Fighting Kaiju", testSquad.getCause());
  }

  @Test
  public void all_returnsAllInstancesOfSquad_true(){
    Squad squad1 = new Squad("Power Rangers", 10, "Fighting Kaiju");
    Squad squad2 = new Squad("Thundercats", 10, "Fighting Mumm-Ra");
    assertTrue(Squad.all().contains(squad1));
    assertTrue(Squad.all().contains(squad2));
  }

  @Test
  public void getId_squadInstantiatesWithId_1() {
    Squad testSquad = new Squad("Power Rangers", 10, "Fighting Kaiju");
    assertEquals(1, testSquad.getId());
  }

  @Test
  public void find_returnsSquadWithSameId_squad2() {
    Squad squad1 = new Squad("Power Rangers", 10, "Fighting Kaiju");
    Squad squad2 = new Squad("Thundercats", 10, "Fighting Mumm-Ra");
    assertEquals(Squad.find(squad2.getId()), squad2);
  }
}
