package enumerate;
/**
 * @Author: zs
 * @Date: 2019/12/31 15:54
 */
public enum Season {
    春天("春天"),夏天("夏天"),冬天("冬天"),秋天("秋天");
    private String SeasonName;

    Season(String val) {
        SeasonName = val;
    }

    @Override
    public String toString() {
        return SeasonName;
    }
}
