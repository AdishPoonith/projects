package z6;

import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public class b implements a {
    @Override // z6.a
    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
