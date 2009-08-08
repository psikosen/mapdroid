package au.id.tedp.mapdroid;

import android.graphics.Bitmap;
import java.lang.String;

class Tile {
    private Bitmap bmp; // may be null
    private int zoomLevel;
    private int x, y;
    // When the tile was generated by scaling an existing tile up or down,
    // it is marked "dirty" so that the tile at the correct scale can be
    // downloaded and replace it.
    private boolean dirty;
    private String url;

    public Tile(String url, int zoom, int x, int y) {
        this.url = url;
        this.zoomLevel = zoom;
        this.x = x;
        this.y = y;
    }

    // XXX: Does anyone even use this constructor anymore?
    public Tile(Bitmap src, int zoom, int x, int y) {
        bmp = src;
        zoomLevel = zoom;
        this.x = x;
        this.y = y;
    }

    public void setBitmap(Bitmap newbmp) {
        bmp = newbmp;
    }

    public Bitmap getBitmap() {
        return bmp;
    }

    public int getZoom() {
        return zoomLevel;
    }

    public int getXTileNumber() {
        return x;
    }

    public int getYTileNumber() {
        return y;
    }

    public String getUrl() {
        return url;
    }
}

/* vim: set ts=4 sw=4 et :*/
