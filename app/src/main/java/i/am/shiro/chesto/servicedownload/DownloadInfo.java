package i.am.shiro.chesto.servicedownload;

import android.content.Intent;

/**
 * Created by Subaru Tashiro on 8/1/2017.
 */

final class DownloadInfo {

    final int id;
    final String url;
    final String filename;
    final int width;
    final int height;

    DownloadInfo(Intent intent) {
        id = intent.getIntExtra("id", -1);
        url = intent.getStringExtra("url");
        filename = intent.getStringExtra("filename");
        width = intent.getIntExtra("width", -1);
        height = intent.getIntExtra("height", -1);
    }
}
