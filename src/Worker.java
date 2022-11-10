public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallBack;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallBack) {
        this.callback = callback;
        this.errorCallBack = errorCallBack;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallBack.onError("Task " + i + " is undone");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }

    }
}
