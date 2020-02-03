public class StallNumber {
    public int number;

    public StallNumber(int number) {
        this.number = number;
    }

    //    Uncomment this to fix memory leak
    //    @Override
    //    public boolean equals(Object o) {
    //        if (this == o) return true;
    //        if (o == null || getClass() != o.getClass()) return false;
    //
    //        StallNumber that = (StallNumber) o;
    //
    //        return number == that.number;
    //    }
    //
    //    @Override
    //    public int hashCode() {
    //        return number;
    //    }
}
