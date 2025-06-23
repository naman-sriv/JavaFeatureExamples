package generics;

public class  Box<T> {

    T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
