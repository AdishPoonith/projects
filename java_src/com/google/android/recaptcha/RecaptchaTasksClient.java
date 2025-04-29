package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public interface RecaptchaTasksClient {
    Task<String> executeTask(RecaptchaAction recaptchaAction);
}
