
enum StatusCodes{
    SUCCESS(100), FAILED(500), RUNNING(102), NOTFOUND(404), ERROR(300);

    private int code;
    StatusCodes(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }
}


public class EnumDemo {
    public static void main(String[] args) {
        StatusCodes s1 = StatusCodes.SUCCESS;
        System.out.println(s1.getCode() + ": " + s1.name());

    }
}
