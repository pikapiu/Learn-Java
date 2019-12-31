package other;

/**
 * @Author: zs
 * @Date: 2019/12/31 11:11
 */
public class Teacher {
    private String name;
    private  String english;
    private  String math;

    public static class Builder{
        private  String name;
        private  String english;
        private  String math;

        public Builder name(String val){ name = val;return this; }
        public Builder english(String val){ english = val;return this; }
        public Builder math(String val){ math = val;return this; }

        public Teacher build(){
            return new Teacher(this);
        }
    }

    public Teacher(Builder builder){
        name = builder.name;
        english = builder.english;
        math = builder.math;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", english='" + english + '\'' +
                ", math='" + math + '\'' +
                '}';
    }
}
