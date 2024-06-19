/*Создайте в классе метод reverse(), который переворачивает тройку.
Метод должен вернуть новую тройку, в который элементы расположены в обратном порядке

Создайте в классе метод isEqualTo(),
который принимает в качестве параметра другую тройку и сравнивает их.
Если они идентичны, метод должен вернуть true, в ином случае false */

import java.util.Objects;

public class SimpleTriple<L, M, R> implements Triple<L, M, R>{

    private L left;
    private M middle;
    private R right;

    public SimpleTriple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    @Override
    public void setLeft(L left) {
        this.left = left;

    }

    @Override
    public void setMiddle(M middle) {
        this.middle = middle;
    }

    @Override
    public void setRight(R right) {
        this.right = right;

    }

    @Override
    public L getLeft() {
        return left;
    }

    @Override
    public M getMiddle() {
        return middle;
    }

    @Override
    public R getRight() {
        return right;
    }

    public SimpleTriple<R, M, L> reverse() {
        return new SimpleTriple<> (getRight(), getMiddle(), getLeft());
    }


    public boolean isEqualTo(SimpleTriple<L, M, R> st) {
        if (this == st) return true;
        if (st == null || getClass() != st.getClass()) return false;
        SimpleTriple<?, ?, ?> that = (SimpleTriple<?, ?, ?>) st;
        return Objects.equals(getLeft(), that.getLeft()) && Objects.equals(getMiddle(), that.getMiddle()) && Objects.equals(getRight(), that.getRight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeft(), getMiddle(), getRight());
    }
}
