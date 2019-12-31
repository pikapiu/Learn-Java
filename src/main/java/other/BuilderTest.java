package other;

/**
 * @Author: zs
 * @Date: 2019/12/31 11:04
 */
public class BuilderTest {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts
                .Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

        System.out.println(cocaCola.toString());

        Teacher teacher = new Teacher.Builder().name("hehe").english("english").math("math").build();
        System.out.println(teacher);
    }
}
