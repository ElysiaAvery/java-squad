import java.util.List;
import java.util.ArrayList;

public class Hero {
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private String mImg;
  private static List<Hero> heroes = new ArrayList<Hero>();
  private int mId;
  private List<Squad> mSquads;

  public Hero(String name, int age, String power, String weakness, String img) {
    mName = name;
    mAge = age;
    mPower = power;
    mWeakness = weakness;
    mImg = img;
    heroes.add(this);
    mId = heroes.size();
    mSquads = new ArrayList<Squad>();
  }

  public String getName() {
    return mName;
  }

  public int getAge() {
    return mAge;
  }

  public String getPower() {
    return mPower;
  }

  public String getWeakness() {
    return mWeakness;
  }

  public String getImg() {
    return mImg;
  }

  public static List<Hero> all() {
    return heroes;
  }

  public static void clear() {
    heroes.clear();
  }

  public int getId() {
    return mId;
  }

  public static Hero find(int id) {
    return heroes.get(id - 1);
  }

  public List<Squad> getSquads() {
    return mSquads;
  }

  public void addSquad(Squad squad) {
    mSquads.add(squad);
  }
}
