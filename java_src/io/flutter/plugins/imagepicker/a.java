package io.flutter.plugins.imagepicker;

import android.util.Log;
import java.util.Arrays;
/* loaded from: classes.dex */
class a {
    private static void b(androidx.exifinterface.media.a aVar, androidx.exifinterface.media.a aVar2, String str) {
        if (aVar.d(str) != null) {
            aVar2.T(str, aVar.d(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        try {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(str);
            androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(str2);
            for (String str3 : Arrays.asList("FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "Orientation")) {
                b(aVar, aVar2, str3);
            }
            aVar2.P();
        } catch (Exception e10) {
            Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e10);
        }
    }
}
