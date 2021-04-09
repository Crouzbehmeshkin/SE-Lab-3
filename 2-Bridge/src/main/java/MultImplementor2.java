import java.lang.Math;

public class MultImplementor2 extends MultImplementor {
    @Override
    public int operation(int a, int b) {
        int result = 0;
        int l = Math.min(a, b);
        int g = Math.max(a, b);
        for (int i = 0; i < l; ++i) {
            result += g;
        }
        return result;
    }
}
