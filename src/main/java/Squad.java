import java.util.List;
import java.util.ArrayList;

public class Squad {
  private String mName;
  private int mSize;
  private String mCause;
  private static List<Squad> squads = new ArrayList<Squad>();
  private int mId;

  public Squad(String name, int size, String cause) {
    mName = name;
    mSize = size;
    mCause = cause;
    squads.add(this);
    mId = squads.size();
  }

  public String getName() {
    return mName;
  }

  public int getSize() {
    return mSize;
  }

  public String getCause() {
    return mCause;
  }

  public static List<Squad> all() {
    return squads;
  }

  public static void clear() {
    squads.clear();
  }

  public int getId() {
    return mId;
  }

  public static Squad find(int id) {
    return squads.get(id - 1);
  }
}
