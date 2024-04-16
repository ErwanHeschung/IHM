package edu.heschung.midterm;

import java.util.List;

public interface PostExecuteActivity<T> {
    void onPostExecute(List<T> itemList);
    void runOnUiThread(Runnable runable);
}
