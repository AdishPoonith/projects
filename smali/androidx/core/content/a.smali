.class public Landroidx/core/content/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/content/a$a;,
        Landroidx/core/content/a$d;,
        Landroidx/core/content/a$b;,
        Landroidx/core/content/a$c;,
        Landroidx/core/content/a$e;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/core/content/a;->a:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/core/content/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    const-string v0, "permission must be non-null"

    invoke-static {p1, v0}, Landroidx/core/util/c;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {}, Landroidx/core/os/a;->c()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Landroidx/core/app/n;->c(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/core/app/n;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0

    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method public static b(Landroid/content/Context;)Landroid/content/Context;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/core/content/a$d;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    invoke-static {v0, p1, p0}, Landroidx/core/content/res/h;->c(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/content/a$c;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;)[Ljava/io/File;
    .locals 0

    invoke-static {p0}, Landroidx/core/content/a$b;->a(Landroid/content/Context;)[Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)[Ljava/io/File;
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/content/a$b;->b(Landroid/content/Context;Ljava/lang/String;)[Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;)Ljava/util/concurrent/Executor;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/core/content/a$e;->a(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-static {v0}, Landroidx/core/os/g;->a(Landroid/os/Handler;)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/core/content/a$a;->a(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static i(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/core/content/a$a;->b(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method
