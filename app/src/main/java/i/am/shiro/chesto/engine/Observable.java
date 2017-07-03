package i.am.shiro.chesto.engine;

import i.am.shiro.chesto.listeners.Listener0;
import i.am.shiro.chesto.listeners.Listener1;

/**
 * Created by Subaru Tashiro on 7/3/2017.
 *
 * Observable class for PostSearch
 */

final public class Observable {

    private Listener1<Boolean> onLoadingListener;
    private Listener0 onErrorListener;
    private Listener1<Integer> onPostAddedListener;
    private Listener1<Integer> onPostUpdatedListener;
    private Listener0 onResultsClearedListener;

    public void unsubscribeAllListeners() {
        onLoadingListener = null;
        onErrorListener = null;
        onPostAddedListener = null;
        onPostUpdatedListener = null;
        onResultsClearedListener = null;
    }

    public void setOnLoadingListener(Listener1<Boolean> listener) {
        onLoadingListener = listener;
    }

    public void setOnErrorListener(Listener0 listener) {
        onErrorListener = listener;
    }

    public void setOnPostAddedListener(Listener1<Integer> listener) {
        onPostAddedListener = listener;
    }

    public void setOnPostUpdatedListener(Listener1<Integer> listener) {
        onPostUpdatedListener = listener;
    }

    public void setOnResultsClearedListener(Listener0 listener) {
        onResultsClearedListener = listener;
    }

    void notifyLoading(boolean isLoading) {
        if (onLoadingListener != null)
            onLoadingListener.onEvent(isLoading);
    }

    void notifyError() {
        if (onErrorListener != null) {
            onErrorListener.onEvent();
        }
    }

    void notifyPostAdded(int index) {
        if (onPostAddedListener != null) {
            onPostAddedListener.onEvent(index);
        }
    }

    void notifyPostUpdated(int index) {
        if (onPostUpdatedListener != null) {
            onPostUpdatedListener.onEvent(index);
        }
    }

    void notifyCleared() {
        if (onResultsClearedListener != null) {
            onResultsClearedListener.onEvent();
        }
    }
}