package se.payerl.haws.types;

public class Result {
    private Context context;

    public Result(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return this.context;
    }
}